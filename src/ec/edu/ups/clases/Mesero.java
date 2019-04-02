/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @version 1.06
 * @since 2019
 * @author RolandoCalle
 */
public class Mesero {

    @Override
    public String toString() {
        return "Mesero{" + "fichapedido=" + fichapedido + ", servicio=" + servicio + ", numeromesa=" + numeromesa + '}';
    }
    
    private String fichapedido;
    private String servicio;
    private  int numeromesa;
    
    /**
     * 
     * @return 
     */
    public String getFichapedido() {
        return this.fichapedido;
    }
    public void setFichapedido(String fichapedido) {
        this.fichapedido =fichapedido;
    }
    
    /**
     * 
     * @return 
     */
    public String getServicio() {
        return this.servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    /**
     * 
     * @return 
     */
    public int getNumeromesa() {
        return this.numeromesa;
    }
    public void setNumeromesa(int numeromesa) {
        this.numeromesa = numeromesa;
    }
    public void mesas(){
        
    }
    public void aservir(){
        
    }
    public void ficha(){
        
    }
}
