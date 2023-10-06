/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

/**
 *
 * @author enriq
 */
public class Recursos {
    private int SueldoEmpleados;
    private int SueldoProjectManager;
    private int Dias;
    private int dineroProducido;
    private int faltas;
    private int dayDuration;
 

    public Recursos(int SueldoEmpleados, int SueldoProjectManager,int dias, int dineroProducido, int faltas, int dayDuration) {
        this.SueldoEmpleados = SueldoEmpleados;
        this.SueldoProjectManager = SueldoProjectManager;
        this.Dias=dias;
        this.dineroProducido = dineroProducido;
        this.faltas = faltas;
        this.dayDuration = dayDuration;
        
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
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
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
    
    
    
   
}
