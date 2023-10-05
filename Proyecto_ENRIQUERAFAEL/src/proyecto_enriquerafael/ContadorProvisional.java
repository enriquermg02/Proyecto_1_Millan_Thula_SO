/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_enriquerafael;

/**
 *
 * @author enriq
 */
public class ContadorProvisional {
    
        public int levels;
        public int narrative;
        public int sprite;
        public int sistem;
        public int DLC;
        public int indice;
        int Developers[];
        
 

    public ContadorProvisional() {
        this.levels = 0;
        this.narrative = 0;
        this.sprite = 0;
        this.sistem = 0;
        this.DLC = 0;
        this.Developers=new int[6];
        this.indice=0;
        llenar();
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

    public int getSprite() {
        return sprite;
    }

    public void setSprite(int sprite) {
        this.sprite = sprite;
    }

    public int getSistem() {
        return sistem;
    }

    public void setSistem(int sistem) {
        this.sistem = sistem;
    }

    public int getDLC() {
        return DLC;
    }

    public void setDLC(int DLC) {
        this.DLC = DLC;
    }

    public int[] getDevelopers() {
        return Developers;
    }

    public void setDevelopers(int[] Developers) {
        this.Developers = Developers;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
    
    
    
    
    
    
    
    
       public void llenar(){
       //narrativa
      Developers[0]=1;
      //levels
      Developers[1]=1;
      //sprites
      Developers[2]=1;
      //sistems
      Developers[3]=1;
      //dlc
      Developers[4]=1;
      //integradores
      Developers[5]=1;
   
  
    }
    
}
