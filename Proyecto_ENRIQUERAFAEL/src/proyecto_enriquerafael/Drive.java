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
public class Drive {
    public int levels;
    public int narrative;
    public int sprite;
    public int sistem;
    public int DLC;
    public int juegos; 
    public int juegosDLC;
    public int contadorN;
    public int contadorB;
    public Semaphore counterMutex;

    public Drive(int levels, int narrative, int sprite, int sistem, int DLC, int juegos, int juegosDLC) {
        this.levels = levels;
        this.narrative = narrative;
        this.sprite = sprite;
        this.sistem = sistem;
        this.DLC = DLC;
        this.juegos = juegos;
        this.juegosDLC = juegosDLC;
        this.contadorN = 0;
        this.contadorB = 0;
        this.counterMutex = new Semaphore(1);

    }

    public int getDLC() {
        return DLC;
    }

    public void setDLC(int DLC) {
        this.DLC = DLC;
    }

 

    public int getSistem() {
        return sistem;
    }

    public void setSistem(int sistem) {
        this.sistem = sistem;
    }



    public int getSprite() {
        return sprite;
    }

    public void setSprite(int sprite) {
        this.sprite = sprite;
    }

   

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getNarrative() {
        return narrative;
    }

    public void setNarrative(int narrative) {
        this.narrative = narrative;
    }
    
     /**
     * @return the juegos
     */
    public int getJuegos() {
        return juegos;
    }

    /**
     * @param juegos the juegos to set
     */
    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }
    
    public void addProduct( String compania,int type){
        
//        narrativa
//        disenador
//        artistas
//        logica
//        desarrollador de DLC
//        juego
        
   if(compania=="Nintendo"){
    if((type == 0)&& (getNarrative()<25)){
        
        setNarrative(getNarrative()+1);
        
    }else if((type==1)&& (getLevels()<20)){
        
        setLevels(getLevels()+1);
        
    }else if((type==2)&&(getSprite()<55)){
        
        setSprite(getSprite()+2);
        
    }else if ((type==3)&&(getSistem()<35)){
        
        setSistem(getSistem()+5);
        
    }else if ((type==4)&&(getDLC()<10)){
        
        setDLC(getDLC()+1);
        
    }
    else if((type==5)&&(this.contadorN <5)){
                if((getNarrative() >= 2) && (getLevels() >= 1) 
             && (getSprite()>=4) && (getSistem()>=4)){
            setJuegos(getJuegos()+1);
            setLevels(getLevels()-1);
            setNarrative(getNarrative()-2);
            setSistem(getSistem()-4);
            setSprite(getSprite()-4);
            this.contadorN +=1;
                            }    
    }
    else if ((type==5)&&(this.contadorN==5)){
        if((getNarrative() >= 2) && (getLevels() >= 1) 
             && (getSprite()>=4) && (getSistem()>=4) && (getDLC()>=2)){
            setJuegosDLC(getJuegosDLC()+1);
            setLevels(getLevels()-1);
            setNarrative(getNarrative()-2);
            setSistem(getSistem()-4);
            setSprite(getSprite()-4);
            setDLC(getDLC()-2);
            this.contadorN=0;
                            }      
    }
   }else if(compania=="Betesda"){
      if((type == 0)&& (getNarrative()<25)){
        
        setNarrative(getNarrative()+1);
        
    }else if((type==1)&& (getLevels()<20)){
        
        setLevels(getLevels()+1);
        
    }else if((type==2)&&(getSprite()<55)){
        
        setSprite(getSprite()+1);
        
    }else if ((type==3)&&(getSistem()<35)){
        
        setSistem(getSistem()+3);
        
    }else if ((type==4)&&(getDLC()<10)){
        
        setDLC(getDLC()+1);
        
    }
    else if((type==5)&&(this.contadorB<6)){
                if((getNarrative() >= 2) && (getLevels() >= 3) 
             && (getSprite()>=4) && (getSistem()>=6)){
            setJuegos(getJuegos()+1);
            setLevels(getLevels()-3);
            setNarrative(getNarrative()-2);
            setSistem(getSistem()-6);
            setSprite(getSprite()-4);
            
            this.contadorB+=1;
                            }    
    }
    else if ((type==5)&&(this.contadorB==6)){
        if((getNarrative() >= 2) && (getLevels() >= 3) 
             && (getSprite()>=4) && (getSistem()>=6) && (getDLC()>=5)){
            setJuegosDLC(getJuegosDLC()+1);
            setLevels(getLevels()-3);
            setNarrative(getNarrative()-2);
            setSistem(getSistem()-6);
            setSprite(getSprite()-4);
            setDLC(getDLC()-5);
            this.contadorB=0;

                            }      
    } 
   }

}

    
  
    
    /**
     * @return the juegosDLC
     */
    public int getJuegosDLC() {
        return juegosDLC;
    }

    /**
     * @param juegosDLC the juegosDLC to set
     */
    public void setJuegosDLC(int juegosDLC) {
        this.juegosDLC = juegosDLC;
    }

    /**
     * @return the contador
     */

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
    
}
