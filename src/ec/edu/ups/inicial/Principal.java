/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.inicial;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.DatosCliente;
import ec.edu.ups.clases.Empleados;
import ec.edu.ups.clases.Asistencia;
import ec.edu.ups.clases.Mesero;

import java.util.Scanner;

/**
 *
 * Practica.01
 * 
 * Esta clase principal es la encargada en realizar la muestra del codigo del proyecto.
 * @version 1.1
 * @since 2019
 * @see https://github.com/SegundoRolando/Practica01-CalleRolando.git
 * @author RolandoCalle
 */
public class Principal {
    public static void main(String[] args) { 
   
 Scanner teclado=new Scanner(System.in);
     
  
 int x;
 do{
     
     
     System.out.println("Menu");
            System.out.println("1. Menu del restaurant.");
            System.out.println("2. Datos del cliente.");
            System.out.println("3. Datos de los empleados.");
            System.out.println("4. Asitencia del restaurant.");
            System.out.println("5. Datos mesero.");
    do{
         System.out.println("Ingrese su opcion: ");
                x=teclado.nextInt();
            }while(x<0 && x>5);
     switch(x){
         case 1:
                Menu menu=new Menu();  
             
                System.out.println("Que clase de comida desea : ");
                String a=teclado.next();
                menu.setTipocomida(a);
                System.out.println(" comida :"+a);

                System.out.println("¿De que precio desea : ");
                int b=teclado.nextInt();
                menu.setCostocomida(b);
                System.out.println(" Precio de la comida :" + b +" dolar");

                System.out.println("¿De que precio desea la bebida");
                int c=teclado.nextInt();
                menu.setCostobebida(c);
                System.out.println("Precio de la bebida :"+ c +" dolar");
        
        break;
         case 2:
                DatosCliente datoscliente=new DatosCliente();

                System.out.println("Por favor ingrese la dirreccion :");
                String e=teclado.next();
                datoscliente.setDirección(" Direccion :" +e);

                System.out.println("Ingrese el nombre del cliente");
                String n=teclado.next();
                datoscliente.setNombrecliente("Nombre :"+n);

                System.out.println("Ingrese el numero de cedula :");
                int aa=teclado.nextInt();
                datoscliente.setNumerocedula(aa);
       break;
         case 3:
             
               Empleados empleados=new Empleados();

               System.out.println("Ingrese su codigo de ingreso :");
               int cod=teclado.nextInt();
               empleados.setCodigo(cod);

               System.out.println("Ingrese el nombre del primero de todos los empleados");
               String nombre=teclado.next();
               empleados.setNombreempleados("nombre"+nombre);

               System.out.println("Cuantos empleados trabajan:");
               int empl=teclado.nextInt();
               empleados.setCantidadempleados(empl);

               System.out.println("Que genero es mas numeroso de empleados :");
               String gen=teclado.next();
               empleados.setGeneroempleados("Genero"+ gen);
        break;
         case 4:
                Asistencia asistenc =new Asistencia();
                
                System.out.println("Que desea que lo prepare de postre");
                String pre=teclado.next();
                asistenc.setPreparar("A preparar"+pre);

                System.out.println("Deme un tiempo nesesario por esperar el producto");
                String coc=teclado.next();
                asistenc.setCocinar("Tiempo de Cocina"+coc);

                System.out.println("confirmar  su tiempo de espera");
                String ser=teclado.next();
                asistenc.setservir("Se a servido :"+ser);
        break;
         case 5:
                Mesero mesero=new Mesero();

                System.out.println("Ingrese el numero de ficha : ");
                int fic=teclado.nextInt();
                mesero.setFichapedido("Ficha"+fic);

                System.out.println("En que numero de mesa se debe servir :");
                int numm=teclado.nextInt();
                mesero.setNumeromesa(numm);

                System.out.println("Ud a sido atendido o no");
                String aten=teclado.next();
                mesero.setServicio("atendido"+aten);
          break;
          default: System.out.println("Usted no escogio la opción correcta");
     }
    }while(x>0 && x<5);
 }
}