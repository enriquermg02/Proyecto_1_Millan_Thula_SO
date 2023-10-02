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
  private int trabajando;
  private Recursos recursos;
  

    public ProjectManager(Recursos recursos,javax.swing.JTextField EstadoPM) {
        this.trabajando = 1;
        this.recursos=recursos;
        this.EstadoPM=EstadoPM;
    }

    public int getTrabajando() {
        return trabajando;
    }

    public void setTrabajando(int trabajando) {
        this.trabajando = trabajando;
    }


  
  
  
  


    
    
    
           
    public void run() {
        while(true) {
  
                try {
                   
            for (int i = 0; i < 32; i++) {
            if (trabajando==1){
                 System.out.println(this.getTrabajando());
                setTrabajando(0);
            }else{
                 System.out.println(this.getTrabajando());
                setTrabajando(1);
                
            }
            EstadoPM.setText(String.valueOf(trabajando));
            sleep(21);
            }
                    setTrabajando(1);
                    recursos.setDias(recursos.getDias()-1);
                    System.out.println(recursos.getDias());
                    sleep(334);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    
    
    
    
    
}
}
