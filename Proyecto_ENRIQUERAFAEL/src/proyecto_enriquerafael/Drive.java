/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

/**
 *
 * @author enriq
 */
public class Drive {
    public int levels;
    public int narrative;
    public int sprite;
    public int sistem;

    public Drive(int levels, int narrative, int sprite, int sistem) {
        this.levels = levels;
        this.narrative = narrative;
        this.sprite = sprite;
        this.sistem = sistem;
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
    
    public void addProduct( int type){
        
//        narrativa
//        disenador
//        artistas
//        logica
//        desarrollador de DLC
        
   
    if((type == 0)&& (getNarrative()<25)){
        
        setNarrative(getNarrative()+1);
        
    }else if((type==1)&& (getLevels()<20)){
        
        setLevels(getLevels()+1);
        
    }else if((type==2)&&(getSprite()<55)){
        
        setSprite(getSprite()+1);
        
    }else if ((type==3)&&(getSprite()<35)){
        
        setSistem(getSistem()+5);
        
    }
    
    
    
    
    }
}
