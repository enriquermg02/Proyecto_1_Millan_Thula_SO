package proyecto_enriquerafael;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leste
 */
public class DirectorJuegos extends Thread {
    private int salario;
    private int accSalario;
    private Recursos recursos;
    private ProjectManager manager;
    private boolean revisarManager;
    private boolean keepGoing;
    private Drive drive;
    private int precioNormal;
    private int precioDLC;
    
    public DirectorJuegos(ProjectManager manager, Recursos recursos, Drive drive, int precioNormal, int precioDLC) {
        this.salario = 30;
        this.recursos = recursos;
        this.manager = manager;
        this.revisarManager = false;
        this.keepGoing = true;
        this.drive = drive;
        this.precioNormal = precioNormal;
        this.precioDLC = precioDLC;
    }
    
    @Override
    public void run() {
        long randomHour;
        long twentyFiveMinutes = this.getTwentyFiveMinutesInMs();
        while(this.keepGoing) {
            try {
                
                if (this.recursos.getDiasSobrantes() == 0) {
                    deliverJuegos();                   
                } else {
                    randomHour = this.getRandomHourInMs();
                    sleep(randomHour);
                    this.setRevisarManager(true);
                    verificarManager();
                    long remainingDay = (long) (this.recursos.getDayDurationInMs() - (randomHour + twentyFiveMinutes));
                    sleep(remainingDay);
                }
                
                getPago();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(DirectorJuegos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void getPago() {
        this.accSalario += this.salario * 24;
        this.recursos.setCostos(this.recursos.getCostos() + (this.salario * 24)); //Hay que revisar
    }
    
    public void verificarManager() {
        long twentyFiveMinutes = getTwentyFiveMinutesInMs();
        if (isRevisarManager()) {
            if (!this.manager.getTrabajando()) {
                try {
                    sleep(twentyFiveMinutes);
                    this.setRevisarManager(false);
                    this.manager.setSalarioacc(this.manager.getSalarioacc() - 50);
                    this.manager.setDiscountedSalary(this.manager.getDiscountedSalary() + 50);
                    this.manager.setFaltas(this.manager.getFaltas() + 1);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(DirectorJuegos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {                   
                    sleep(twentyFiveMinutes);
                    this.setRevisarManager(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DirectorJuegos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
    
    public void deliverJuegos() {
        int standardIncome;
        int accessoryIncome;
        try {
            // Resetea contador
            this.recursos.getCounterMutex().acquire();
            this.recursos.setDiasSobrantes(this.recursos.getDias());
            this.recursos.getCounterMutex().release();
            
            // Accede al drive y mete juegos y registra las ganancias
            this.drive.getCounterMutex().acquire();
            sleep((long) this.recursos.getDayDurationInMs());
            standardIncome = (int) (this.drive.getJuegos() * this.precioNormal);
            accessoryIncome = (int) (this.drive.getJuegos() * this.precioDLC);
            this.recursos.setDineroProducido(this.recursos.getDineroProducido() + standardIncome + accessoryIncome);
            this.drive.setJuegos(0);
            this.drive.setJuegosDLC(0);
            this.drive.getCounterMutex().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(DirectorJuegos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public long getRandomHourInMs() {
        long hourInMs = (long) (this.recursos.getDayDurationInMs() / 24);
        Random random = new Random();
        long randomHour = random.nextInt(24);
        return randomHour * hourInMs;
    }
    
    public long getTwentyFiveMinutesInMs() {
        int dayInMinutes = 1440;
        long twentyFiveMinutes = (long) ((25 * this.recursos.getDayDurationInMs())/dayInMinutes);
        return twentyFiveMinutes;
    }
    
    public void stopRunning() {
        this.keepGoing = false;
    }
    
    // Getters and setters

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalarioAcc() {
        return accSalario;
    }

    public void setSalaryAcc(int accSalario) {
        this.accSalario = accSalario;
    }

    public Recursos getRecursos() {
        return recursos;
    }

    public void setPlant(Recursos recursos) {
        this.recursos = recursos;
    }

    /**
     * @return the revisarManager
     */
    public boolean isRevisarManager() {
        return revisarManager;
    }

    /**
     * @param revisarManager the revisarManager to set
     */
    public void setRevisarManager(boolean revisarManager) {
        this.revisarManager = revisarManager;
    }

    
}
