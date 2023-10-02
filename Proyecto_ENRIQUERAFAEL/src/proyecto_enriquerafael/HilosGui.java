/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enriq
 */
public class HilosGui extends Thread  {

    
    private Drive drive;
  
    javax.swing.JTextField Texto0;
   
    javax.swing.JTextField Texto1;
    javax.swing.JTextField Texto2;
    javax.swing.JTextField Texto3;
    javax.swing.JTextField Texto4;
    javax.swing.JTextField sinDLC;
    javax.swing.JTextField conDLC;

    
    
    public HilosGui(Drive drive,javax.swing.JTextField Texto0,javax.swing.JTextField Texto1,
            javax.swing.JTextField Texto2,javax.swing.JTextField Texto3, javax.swing.JTextField Texto4,
            javax.swing.JTextField sinDLC, javax.swing.JTextField conDLC) {
        
        this.drive=drive;
        this.Texto0=Texto0;
        this.Texto1=Texto1;
        this.Texto2=Texto2;
        this.Texto3=Texto3;
        this.Texto4=Texto4;
        this.sinDLC=sinDLC;
        this.conDLC=conDLC;

    }
    
        
    
    
    @Override
        
        
    public void run() {
        while(true) {
            actualizar(Texto0,Texto1,Texto2,Texto3,Texto4,sinDLC,conDLC);
         
    }
    
    }  
     public void actualizar(javax.swing.JTextField Texto0,javax.swing.JTextField Texto1,javax.swing.JTextField Texto2,
             javax.swing.JTextField Texto3, javax.swing.JTextField Texto4, javax.swing.JTextField sinDLC, javax.swing.JTextField conDLC){
         

         
         while(true){
          Texto0.setText(String.valueOf(drive.getNarrative()));
          Texto1.setText(String.valueOf(drive.getLevels()));
          Texto2.setText(String.valueOf(drive.getSprite()));
          Texto3.setText(String.valueOf(drive.getSistem()));
          Texto4.setText(String.valueOf(drive.getDLC()));
          sinDLC.setText(String.valueOf(drive.getJuegos()));
          conDLC.setText(String.valueOf(drive.getJuegosDLC()));

          

         }
         
         
     }
    
    
    
    
    
    
    }    

