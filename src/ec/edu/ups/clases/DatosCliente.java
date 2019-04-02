/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @version 1.04
 * @since 2019
 * @author RolandoCalle
 */
public class DatosCliente {

    @Override
    public String toString() {
        return "DatosCliente{" + "nombrecliente=" + nombrecliente + ", numerocedula=" + numerocedula + ", direcci\u00f3n=" + dirección + '}';
    }
    
   private String  nombrecliente; 
   private int numerocedula;
   private String  dirección;
   /**
    * 
    * @return 
    */
     public String getNombreCLiente() {
        return this.nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    /**
     * 
     * @return 
     */
     public int getNumerocedula() {
        return this.numerocedula;
    }

    public void setNumerocedula(int numerocedula) {
        this.numerocedula = numerocedula;
    }
    /**
     * 
     * @return 
     */
     public String getDirección() {
        return this.dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    public void direciion(){
        
    }
    public void cedula(){
        
    }
    public void cliente(){
        
    }
}
