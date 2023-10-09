/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_enriquerafael;


/**
 *
 * @author enriq
 */
public class Proyecto_ENRIQUERAFAEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
                 
        InterfazG interG = new InterfazG();
        HiloGrafica hilo= new HiloGrafica(interG.recursosN,interG.getGrafico(),interG.dataset,interG.recursosN.getDayDuration(),interG.recursosB);
        hilo.start();
//        HiloGrafica hilo2= new HiloGrafica(interG.recursosB,interG.getGrafico(),interG.dataset,interG.recursosB.getDayDuration());
//        hilo2.start();
        interG.setVisible(true);
        
             
    } 
}
