/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_enriquerafael;

import java.util.concurrent.Semaphore;

/**
 *
 * @author enriq
 */
public class Proyecto_ENRIQUERAFAEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
           
        Semaphore mutex = new Semaphore(1);
        // TODO code application logic here
        Drive drive = new Drive(0, 0);
        Developer dev1 = new Developer(0, 0.34f, drive,mutex);
        
        
        dev1.start();
          
    }
    
}
