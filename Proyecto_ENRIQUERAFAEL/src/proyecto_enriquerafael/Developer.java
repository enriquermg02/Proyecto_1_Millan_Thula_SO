/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static proyecto_enriquerafael.Interfaz.drive;

/**
 *
 * @author enriq
 */
public class Developer extends Thread {
    
    static javax.swing.JTextField Texto0;
    private String compania;
    private int type;
    private float productionPerDay;
    private float acc = 0;
    private Drive drive;
    private Recursos recursos;
    static Semaphore mutex;
    private int contadorDLC;
    
    public Developer (String compania,int type, float pp, Drive drive, Semaphore m,Recursos recursos){
        this.type = type;
        this.productionPerDay = pp;
        this.drive = drive;
        this.mutex = m;
        this.recursos=recursos;
        this.compania=compania;
        
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    
    
    
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
  
    

    @Override
    public void run() {
        while(true) {
           
            try {
                
                Work();
                sleep(recursos.getDayDurationInMs());


                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        this.acc += this.productionPerDay;
        if (this.acc >= 1){
            
            
            
            
            
            
            try {
                 // sección critica
                if (type==6){
//                    System.out.println("hola coca cola");
                }

                else{
                this.mutex.acquire(1);
                this.drive.addProduct(compania, type);
                this.recursos.agregar(type);
                this.acc=0;
                this.mutex.release();
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
    }
    
    
    
    
}
