/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * 
 * @version 1.05
 * @since 2019
 * @author RolandoCalle
 */
public class Empleados {

    @Override
    public String toString() {
        return "Empleados{" + "codigo=" + codigo + ", nombreempleados=" + nombreempleados + ", cantidadempleados=" + cantidadempleados + ", generoempleados=" + generoempleados + '}';
    }
    
    private int codigo;
    private String nombreempleados;
    private int cantidadempleados;
    private String generoempleados;
    /**
     * 
     * @return 
     */
     public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }
    
    /**
     * 
     * @return 
     */
    public String getNombreempleados() {
        return this.nombreempleados;
    }

    public void  setNombreempleados(String nombreempleados) {
        this.nombreempleados = nombreempleados;
    }
    /**
     * 
     * @return 
     */
     public int  getCantidadempleados() {
        return this.cantidadempleados;
    }

    public void setCantidadempleados(int cantidadempleados) {
        this.cantidadempleados = cantidadempleados;
    }
    
     
     public String getGeneroempleados() {
        return this.generoempleados;
    }

    public void setGeneroempleados(String generoempleados) {
        this.generoempleados = generoempleados;
    }
    public void empleado(){
        
    }
    public void cantidaempleado(){
        
    }
    public void generoempleado(){
        
    }
}
