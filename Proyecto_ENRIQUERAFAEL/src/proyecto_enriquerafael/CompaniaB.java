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
public class CompaniaB {
    
    
    InterfazB inter;
    
    Thread trabajadores [];
    
    Drive drive;
    
    Recursos recursos;
    
    Semaphore mutex ;

    public CompaniaB(InterfazB inter, Semaphore mutex, Recursos recursosB, Drive driveB) {
        this.inter = inter;
        
        this.trabajadores = new Thread[12];
        this.drive = driveB;
        this.recursos = recursosB;
        this.mutex=mutex;
        
    }

    public InterfazB getInter() {
        return inter;
    }

    public void setInter(InterfazB inter) {
        this.inter = inter;
    }

    public Thread[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Thread[] trabajadores) {
        this.trabajadores = trabajadores;
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
        Llenarlista();
        
        
        
        
        
        
    }
    
    
      public void Actualizar(){
        
        HilosGui actu = new HilosGui(drive,inter.getTexto0(),inter.getTexto1(),inter.getTexto2(),inter.getTexto3(),inter.getTexto4(),inter.getSinDLC(),inter.getConDLC());
        actu.start();
     
    }
    
    
    public void crearhilosfijos(){
        
        Developer dev1 = new Developer(0, 0.25f, drive,mutex,recursos);
        dev1.start();
        Developer dev2= new Developer(1, 0.25f, drive,mutex,recursos);
        dev2.start();
        Developer dev3 = new Developer(2, 1, drive,mutex,recursos);
        dev3.start();
        Developer dev4 = new Developer(3, 5, drive,mutex,recursos);
        dev4.start();
        Developer dev5 = new Developer(4, 0.5f, drive,mutex,recursos);
        dev5.start();
        Developer inte1 = new Developer(5, 0.25f, drive, mutex, recursos);
        inte1.start();
        
        
        
    }
    
    
    
    
    public void Llenarlista(){
        
                for (int i = 0; i < 12; i++) {
           Developer nuevo = new Developer(6, 1, drive,mutex,recursos);
             trabajadores[i]=nuevo;
                    System.out.println(i);
        }
        
    }
    
    
    
    public void dios(){
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
