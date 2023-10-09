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
        perrogato();
//        Llenarlista();
//        
        
        
        
        
        
    }
    
    
      public void Actualizar(){
        
        HilosGui actu = new HilosGui(recursos,drive,inter.getTexto0(),inter.getTexto1(),inter.getTexto2(),inter.getTexto3(),inter.getTexto4(),inter.getSinDLC(),inter.getConDLC()
        ,inter.getEstadoPM(), inter.getFaltas(), inter.getDescontado(), inter.getEntrega(), inter.getTotal(),inter.getEstadoD());
        
     
    }
    
    ////5
    public void crearhilosfijos(){
        
        Developer dev1 = new Developer("Betesda",0, 0.34f, drive,mutex,recursos);
        dev1.start();
        Developer dev2= new Developer("Betesda",1, 0.34f, drive,mutex,recursos);
        dev2.start();
        Developer dev3 = new Developer("Betesda",2, 1, drive,mutex,recursos);
        dev3.start();
        Developer dev4 = new Developer("Betesda",3, 1, drive,mutex,recursos);
        dev4.start();
        Developer dev5 = new Developer("Betesda",4, 0.34f, drive,mutex,recursos);
        dev5.start();
        Developer inte1 = new Developer("Betesda",5, 0.25f, drive, mutex, recursos);
        inte1.start();
        
        
        
    }
    
    
    
    
//    public void Llenarlista(){
//        
//                for (int i = 0; i < 12; i++) {
//           Developer nuevo = new Developer(6, 1, drive,mutex,recursos);
//             trabajadores[i]=nuevo;
//        }
//        
//    }
    
    
        public void perrogato(){

         ProjectManager pj=new ProjectManager(recursos,inter.getEstadoPM(),drive, inter.getFaltas(), inter.getDescontado());
         pj.start();
         DirectorJuegos director = new DirectorJuegos(pj, recursos, drive, 450000, 900000,inter.getEstadoD());
         director.start();

}   
    public void dios(){
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
