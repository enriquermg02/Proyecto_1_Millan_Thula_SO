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
        Recursos recursosnintendo= new Recursos(0,0,14,0,0);
        Drive drive = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorSpinner = new ContadorProvisional();

        Thread NarrativaDevelopers []= new Thread[20];
        System.out.println(NarrativaDevelopers[3]);
//        for (int i = 0; i < 19; i++) {
//           Developer nuevo = new Developer(1, 1, drive,mutex,recursos);
//             NarrativaDevelopers[i]=nuevo; 
//        }
         Developer hola[]= new Developer[20];    
       
       Interfaz inter= new Interfaz(drive,mutex,recursosnintendo,NarrativaDevelopers,ContadorSpinner);
        
        inter.setVisible(true);
        

        Integradores inte = new Integradores(0.5f, drive, mutex, recursosnintendo);
        inte.start();
        
        Compania nintendo =new Compania (inter,drive,recursosnintendo,mutex );
        nintendo.fundar();

}
    
  
}
