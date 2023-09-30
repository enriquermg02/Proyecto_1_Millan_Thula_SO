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

    public Drive(int levels, int narrative) {
        this.levels = levels;
        this.narrative = narrative;
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
    
    public void addProduct(int productQty, int type){
    if(type == 0){
        setLevels(getLevels()+productQty);
    }
    }
}
