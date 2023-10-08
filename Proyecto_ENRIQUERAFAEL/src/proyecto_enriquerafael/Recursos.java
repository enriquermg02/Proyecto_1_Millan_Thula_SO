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
public class Recursos {
    private int SueldoEmpleados;
    private int SueldoProjectManager;
    private int Dias;
    private int dineroProducido;
    private int costos;
    private int beneficio;    
    private int dayDuration; 
    public int diasSobrantes;
    private Semaphore counterMutex;

 

    public Recursos(int SueldoEmpleados, int SueldoProjectManager,int dias, int dayDuration) {
        this.SueldoEmpleados = SueldoEmpleados;
        this.SueldoProjectManager = SueldoProjectManager;
        this.Dias=dias;
        this.dineroProducido = 0;
        this.costos = 0;
        this.beneficio = 0;
        this.dayDuration = dayDuration;
        this.counterMutex = new Semaphore(1);
        
    
        
    }
 
    public int getDayDurationInMs() {
        int dayDurationInMs = this.dayDuration * 1000;
        return dayDurationInMs;
    }
    
    public void calculateNetIncome() {
        this.setBeneficio((int) (this.getDineroProducido() - this.getCostos()));
    }

    public int getSueldoEmpleados() {
        return SueldoEmpleados;
    }

    public void setSueldoEmpleados(int SueldoEmpleados) {
        this.SueldoEmpleados = SueldoEmpleados;
    }

    public int getSueldoProjectManager() {
        return SueldoProjectManager;
    }

    public void setSueldoProjectManager(int SueldoProjectManager) {
        this.SueldoProjectManager = SueldoProjectManager;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }
    
    public void agregar(int type){
        
        
        //FALTA AGREGAR OTRO SEMAFORO
        
        
        
        if((type == 0)){
        
        setSueldoEmpleados(getSueldoEmpleados()+10);

        
    }else if((type==1)){
        
     setSueldoEmpleados(getSueldoEmpleados()+13);

    }else if((type==2)){
        
         setSueldoEmpleados(getSueldoEmpleados()+20);

    }else if ((type==3)){
           setSueldoEmpleados(getSueldoEmpleados()+8);

    }else if ((type==4)){

               setSueldoEmpleados(getSueldoEmpleados()+17);
    }else if((type==5)){
               setSueldoEmpleados((getSueldoEmpleados()+25));
    }
    }

    /**
     * @return the dineroProducido
     */
    public int getDineroProducido() {
        return dineroProducido;
    }

    /**
     * @param dineroProducido the dineroProducido to set
     */
    public void setDineroProducido(int dineroProducido) {
        this.dineroProducido = dineroProducido;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the diasSobrantes
     */
    public int getDiasSobrantes() {
        return diasSobrantes;
    }

    /**
     * @param diasSobrantes the diasSobrantes to set
     */
    public void setDiasSobrantes(int diasSobrantes) {
        this.diasSobrantes = diasSobrantes;
    }

    /**
     * @return the counterMutex
     */
    public Semaphore getCounterMutex() {
        return counterMutex;
    }

    /**
     * @param counterMutex the counterMutex to set
     */
    public void setCounterMutex(Semaphore counterMutex) {
        this.counterMutex = counterMutex;
    }

    /**
     * @return the costos
     */
    public int getCostos() {
        return costos;
    }

    /**
     * @param costos the costos to set
     */
    public void setCostos(int costos) {
        this.costos = costos;
    }

    /**
     * @return the beneficio
     */
    public int getBeneficio() {
        return beneficio;
    }

    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
    
    
    
   
}
