/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

import java.util.concurrent.Semaphore;

/**
 *
 * @author enriq
 */
public class Compania {
    
    
    Interfaz inter;
    
    int Developers[];
   
    Drive drive;
    
    Recursos recursos;
    
    Semaphore mutex ;

    public Compania(Interfaz inter, Semaphore mutex, Recursos recursosN, Drive driveN) {
        this.inter = inter;
        
        
        this.drive = driveN;
        this.recursos = recursosN;
        this.mutex=mutex;
        this.Developers=new int[5];
        
    }

    public Interfaz getInter() {
        return inter;
    }

    public void setInter(Interfaz inter) {
        this.inter = inter;
    }





    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Recursos getRecursos() {
        return recursos;
    }

    public void setRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }
    
    
    
    
    
    
    public void fundar(){
        
       Actualizar();
       crearhilosfijos();
       perrogato();
        
        
        
        
        
    }
    
 
    
      public void Actualizar(){
        
        HilosGui actu = new HilosGui(recursos, drive,inter.getTexto0(),inter.getTexto1(),inter.getTexto2(),inter.getTexto3(),
                inter.getTexto4(),inter.getSinDLC(),inter.getConDLC(), inter.getEstadoPM(), inter.getFaltas(), 
                inter.getDescontado(), inter.getEntrega(), inter.getTotal(),inter.getEstadoD());
        actu.start();
     
    }
    
    
    public void crearhilosfijos(){
        
        Developer dev1 = new Developer("Nintendo",0, 0.25f, drive,mutex,recursos);
        dev1.start();
        Developer dev2= new Developer("Nintendo",1, 0.25f, drive,mutex,recursos);
        dev2.start();
        Developer dev3 = new Developer("Nintendo",2, 1, drive,mutex,recursos);
        dev3.start();
        Developer dev4 = new Developer("Nintendo",3, 1, drive,mutex,recursos);
        dev4.start();
        Developer dev5 = new Developer("Nintendo",4, 0.5f, drive,mutex,recursos);
        dev5.start();
        Developer inte1 = new Developer("Nintendo",5, 0.25f, drive, mutex, recursos);
        inte1.start();
        
        
        
    }
    
    
     public void perrogato(){

         ProjectManager pj=new ProjectManager(recursos,inter.getEstadoPM(),drive, inter.getFaltas(), inter.getDescontado());
         pj.start();
         DirectorJuegos director = new DirectorJuegos(pj, recursos, drive, 550000, 600000,inter.getEstadoD());
         director.start();

}   
        

        
        
    }




    
 

