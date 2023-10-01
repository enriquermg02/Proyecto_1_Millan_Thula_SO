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

    javax.swing.JTextField Texto;
    
    public HilosGui(Drive drive,javax.swing.JTextField Texto) {
        
        this.drive=drive;
        this.Texto=Texto;
    }
    
        
    
    
    @Override
        
        
    public void run() {
        while(true) {
            actualizar(Texto);
         
    }
    
    }  
     public void actualizar(javax.swing.JTextField Texto){
         

         
         while(true){
          Texto.setText(String.valueOf(drive.getNarrative()));

         }
         
         
     }
    
    
    
    
    
    
    }    

