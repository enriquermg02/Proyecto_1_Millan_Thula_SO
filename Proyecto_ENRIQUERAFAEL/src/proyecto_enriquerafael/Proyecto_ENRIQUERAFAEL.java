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
     
           
        Semaphore mutex = new Semaphore(1);
        Recursos recursos= new Recursos(0,0,14,0,0);
        // TODO code application logic here
        Drive drive = new Drive(0,0,0,0,0,0,0);
        Interfaz inter= new Interfaz(drive,mutex,recursos);
        inter.setVisible(true);
        
        Developer dev1 = new Developer(0, 0.25f, drive,mutex,recursos);
        dev1.start();
        Developer dev2 = new Developer(1, 1, drive,mutex,recursos);
        dev2.start();
        Developer dev3 = new Developer(2, 0.34f, drive,mutex,recursos);
        dev3.start();
        Developer dev4 = new Developer(3, 0.25f, drive,mutex,recursos);
        dev4.start();
//      Developer dev1 = new Developer(0, 0.25f, drive,mutex);
        Developer dev5 = new Developer(4, 1, drive,mutex,recursos);
        dev5.start();
        Integradores inte = new Integradores(0.5f, drive, mutex, recursos);
        inte.start();

     
        

    
}
}
