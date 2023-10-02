/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author enriq
 */
public class Director extends Thread{
    private Recursos recursos;
    private Drive drive;
    private Random rand = new Random();
    
    public Director(Recursos recursos) {
        this.recursos=recursos;
        this.drive = drive;
    }
    
    public void run(int trabajando){
        while(true){
            try {
            if (this.recursos.getDias() < 1) {
                this.recursos.setDineroProducido(this.recursos.getDineroProducido()
                        + this.drive.juegos*550000 + this.drive.juegosDLC*600000);
                this.drive.setJuegos(0);//esto va al final de este condicional if
            }
            else{
                int upperbound = 975;
                int int_random = rand.nextInt(upperbound);
                sleep(int_random);
                for (int i = 0; i < 25; i++) {
                    if (trabajando == 0) {
                        this.recursos.setFaltas(this.recursos.getFaltas()+1);
                    }
                }
                this.recursos.setDias(this.recursos.getDias()-1);
                }
            }
            catch(InterruptedException ex){
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
