/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @version 1.03
 * @since 2019
 * @author RolandoCalle
 */
public class Asistencia {

    @Override
    public String toString() {
        return "Asistencia{" + "preparar=" + preparar + ", cocinar=" + cocinar + ", servir=" + servir + '}';
    }
    private String preparar;
    private  String cocinar;
    private String servir;
    
    /**
     * 
     * @return 
     */
     public String getPreparar() {
        return this.preparar;
    }
    public void setPreparar(String preparar) {
        this.preparar = preparar;
    }   
    /**
     * 
     * @return 
     */ 
    public String getCocinar() {
        return this.cocinar;
    }
    public void setCocinar(String cocinar) {
        this.cocinar = cocinar;
    }
     /**
      * 
      * @return 
      */   
    public String getservir() {
        return this.servir;
    }
    public void setservir(String servir) {
        this.servir = servir;
    }
    public void cocina(){
        
    }
    public void sevicio(){
        
    }
    public void preparar(){
        
    }
}
