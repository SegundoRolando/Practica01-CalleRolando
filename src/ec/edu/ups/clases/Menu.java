/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;


/**
 *
 * @version 1.02
 * @since 2019
 * @author RolandoCalle
 */
public class Menu {

    @Override
    public String toString() {
        return "Menu{" + "tipocomida=" + tipocomida + ", costocomida=" + costocomida + ", costobebida=" + costobebida + '}';
    }
   
    private String tipocomida;
    private int costocomida;
    private int costobebida;
    /**
     * 
     * @return 
     */
    
    public String getTipocomida(){
        return this.tipocomida;
    }
    public void setTipocomida(String tipocomida){
        this.tipocomida=tipocomida;
    }
/**
 * 
 * @return 
 */
    public int getCostocomida(){
        
        return this.costocomida;
    }
    public void setCostocomida(int costocomida){
        this.costocomida=costocomida;
        }
    /**
     * 
     * @return 
     */
    public int  getCostobebida(){
        return this.costobebida;
    }
    public void setCostobebida(int  costobebida){
        this.costobebida=costobebida;
    }
    
    public void costdelacomida(){
        
    }
    public void costdelabebida(){
        
    }
    public void clasedecomida(){
        
    }
    
    
    
}
