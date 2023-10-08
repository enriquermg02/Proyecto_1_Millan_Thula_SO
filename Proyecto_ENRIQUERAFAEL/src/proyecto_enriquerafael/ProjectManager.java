/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leste
 */
public class ProjectManager extends Thread{
    
    javax.swing.JTextField EstadoPM;
    javax.swing.JTextField Faltas;
    javax.swing.JTextField Descontado;
    private boolean trabajando;
    private Recursos recursos;
    private int salario;
    private int salarioacc;
    private int discountedSalary;
    private int faltas;
    private Drive drive;
  

    public ProjectManager(Recursos recursos,javax.swing.JTextField EstadoPM, Drive drive, javax.swing.JTextField Faltas, javax.swing.JTextField Descontado) {
        this.trabajando = false;
        this.recursos=recursos;
        this.EstadoPM=EstadoPM;
        this.Faltas=Faltas;
        this.Descontado=Descontado;
        this.drive = drive;
        
    }

    public boolean getTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }
    
    public long getSixteenHoursInMs() {
        int dayInHours = 24;
        long sixteenHours = (long) ((16 * this.recursos.getDayDurationInMs())/dayInHours);
        return sixteenHours;
    }
    
           
    public void run() {
        while(true) {
  
                try {
                   
            for (int i = 0; i < 32; i++) {
            if (trabajando){
                 
                setTrabajando(false);
            }else{
                 
                setTrabajando(true);
                
            }
            EstadoPM.setText(String.valueOf(trabajando));
            Faltas.setText(String.valueOf(faltas));
            Descontado.setText(String.valueOf(discountedSalary));

            sleep(21);
            }
                    setTrabajando(true);
                    recursos.setDiasSobrantes(recursos.getDiasSobrantes()-1);

                    sleep(334);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    
    
    
    
    
}

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the salarioacc
     */
    public int getSalarioacc() {
        return salarioacc;
    }

    /**
     * @param salarioacc the salarioacc to set
     */
    public void setSalarioacc(int salarioacc) {
        this.salarioacc = salarioacc;
    }

    /**
     * @return the discountedSalary
     */
    public int getDiscountedSalary() {
        return discountedSalary;
    }

    /**
     * @param discountedSalary the discountedSalary to set
     */
    public void setDiscountedSalary(int discountedSalary) {
        this.discountedSalary = discountedSalary;
    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
