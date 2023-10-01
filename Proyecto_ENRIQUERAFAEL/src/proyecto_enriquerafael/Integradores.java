/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leste
 */
public class Integradores extends Thread {
    private Drive drive;
    private float productionPerDay;
    private int dayDuration = 1000;
    private float acc = 0;
    Semaphore mutex;



    
    public Integradores(float pp, Drive drive){
        this.productionPerDay = pp;
        this.drive = drive;     
    }
    
    @Override
    public void run() {
        while(true) {
           
            try {
                
                Work();
                sleep(dayDuration);
                
                
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
                this.mutex.acquire(1);
               
                
                
                this.mutex.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        System.out.println(this.drive.getLevels());
    }
    
            
}
