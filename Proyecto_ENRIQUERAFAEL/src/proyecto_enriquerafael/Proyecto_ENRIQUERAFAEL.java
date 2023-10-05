/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_enriquerafael;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author enriq
 */
public class Proyecto_ENRIQUERAFAEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Developer enrique[]= new Developer [12];
        
        
         
        
        
        
        
        
        
        
        
        Semaphore mutex = new Semaphore(1);
        //Area Nintendo//
        Recursos recursosnintendo= new Recursos(0,0,14,0,0);
        Drive drive = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorN = new ContadorProvisional();
        Thread DevelopersN []= new Thread[20];
        Interfaz interN = new Interfaz(drive,mutex,recursosnintendo,DevelopersN,ContadorN,enrique);
        Compania nintendo =new Compania (interN, mutex );
        nintendo.fundar();
        //Fin//
        //Area Bethesda//
        Recursos recursosB = new Recursos(0,0,14,0,0);
        Drive driveB = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorB = new ContadorProvisional();
        Thread NarrativaB []= new Thread[20];
        InterfazB interB = new InterfazB(driveB, mutex, recursosB, NarrativaB, ContadorB);
        CompaniaB bethesda =new CompaniaB (interB ,mutex );
        nintendo.fundar();
        //
        
        InterfazG interG = new InterfazG(interN, interB);
        interG.setVisible(true);
        
        for (int i = 0; i< 11; i++) {
               enrique[i] =new Developer(6, 0.25f, drive, mutex, recursosnintendo);
               
               
              
            }
       
        
}
    
  
}
