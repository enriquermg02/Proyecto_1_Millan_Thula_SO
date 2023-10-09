/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

import java.awt.BorderLayout;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author enriq
 */
public class HiloGrafica extends Thread{
    
    javax.swing.JPanel grafico;
    
    DefaultCategoryDataset dataset;
  
    Recursos recursos;
    Recursos recursos2;
    int dayduration;

    
  
    public HiloGrafica(Recursos recursos,javax.swing.JPanel grafico,DefaultCategoryDataset dataset,int daydayduration,Recursos recursos2) {
        this.grafico=grafico;
        this.dataset = dataset; 
        this.recursos=recursos;
        this.recursos2=recursos2;
        this.dayduration=dayduration;
    }
    
    
    
     @Override
        
        
    public void run() {
        while(true) {
            
           
            
            try { 
                actualizar();
                sleep(dayduration);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloGrafica.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }
    
    }  
     public void actualizar(){
         
        
                        
         int valor1=recursos.getDineroProducido()-(recursos.getSueldoEmpleados()+recursos.getSueldoProjectManager()+recursos.getSueldoDirector());
         int valor2=recursos2.getDineroProducido()-(recursos2.getSueldoEmpleados()+recursos2.getSueldoProjectManager()+recursos2.getSueldoDirector());
         dataset.addValue(valor1, "Nintendo", String.valueOf(recursos.getDiasPasados()));
         dataset.addValue(valor2, "Betesda", String.valueOf(recursos.getDiasPasados()));
         grafico.setLayout(new BorderLayout());
            

       
     }
    
    
    
}
