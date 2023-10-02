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
public class Integradores extends Thread{
    private Drive drive;
    private float productionPerDay;
    private int dayDuration = 1000;
    private float acc = 0;
    static Semaphore mutex;
    private Recursos recursos;
    private int contadorDLC;

    
    public Integradores(float pp, Drive drive, Semaphore m, Recursos recursos){
        this.productionPerDay = pp;
        this.drive = drive;
        this.mutex = m;
        this.recursos = recursos;
        
    }
    
    
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
                if(this.contadorDLC >= 5){
                    if((this.drive.getNarrative() >= 2) && (this.drive.getLevels() >= 1) 
                        && (this.drive.getSprite()>=4) && (this.drive.getSistem()>=4) && (this.drive.getDLC()>=2)){
                    this.drive.setJuegosDLC(this.drive.getJuegosDLC()+1);
                    this.drive.setLevels(this.drive.getLevels()-1);
                    this.drive.setNarrative(this.drive.getNarrative()-2);
                    this.drive.setSistem(this.drive.getSistem()-4);
                    this.drive.setSprite(this.drive.getSprite()-4);
                    this.contadorDLC = 0;
                    }
                }else{
                    
                if((this.drive.getNarrative() >= 2) && (this.drive.getLevels() >= 1) 
                        && (this.drive.getSprite()>=4) && (this.drive.getSistem()>=4)){
                this.drive.setJuegos(this.drive.getJuegos()+1);
                this.drive.setLevels(this.drive.getLevels()-1);
                this.drive.setNarrative(this.drive.getNarrative()-2);
                this.drive.setSistem(this.drive.getSistem()-4);
                this.drive.setSprite(this.drive.getSprite()-4);
                this.contadorDLC += 1;
                    }
                }
                this.acc = 0;
                
                this.mutex.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
    }
    
}
