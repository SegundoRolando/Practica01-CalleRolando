# Practica01-CalleRolando
Esta es la Primera Práctica de Programación Aplicada

 	PRÁCTICA DE LABORATORIO 

CARRERA: Computación	ASIGNATURA: Programación Aplicada
NRO. PRÁCTICA:	01	TÍTULO PRÁCTICA:  Programación Orientada a Objetos

OBJETIVO ALCANZADO:
Esta práctica nos permite desarrollar el conocimiento básico hacia la programación.
Se utilizó la página (lucitchart) la cual nos permite diseñar clases Uml Siendo esta la que nos facilita y nos orienta en la programación. 
Esta práctica nos permitirá  conocer herramientas que nos facilitaran  compartir información sobre la programación.
ACTIVIDADES DESARROLLADAS
1. Describir 10 objetos relacionados a tema de Restaurantes.
1.1 Asistencia
1.2 Datos Cliente
1.3 Empleados
1.4 Menú
1.5 Mesero
1.6 Pedidos
1.7 sueldo
1.8 Nombredelrestaurant
1.9 reservaciones
1.10 Contador






2. De los 10 objetos descritos en el paso 1, abstraer 5 de ellos en clases y diagramarlas con tres atributos y tres métodos mínimo para cada clase (los métodos getter y setter no cuentan).
1.1 Asistencia
(-preparar:String -cocinar:String -servir :int:String;)
(+rellenarAsistencia(texto:String) +procesoDePreparacion(texto:String) +crearInforme(texto:String) +eliminar informe(texto boolean))
1.2 Datos Cliente
(-nombreCliente:String - numeroCedula:int - direccion:String)
(+crearDatos(dato:String,num:int) +modificarDatos(dato:String) +eliminarDatos(dato:boolean))
1.3 Empleados
(-codigo:int -nombresEmpleados:String -cantidadEmpleados:int -generoEmpleados:String)
(+crearDatosEmpleado(texto:String ) +ModificarDatosEmpleado(texto:String, codigo:int) +eliminarDatos(Texto:bolean))
1.4 Menú
( -tipoDeComida:String -costoComida:double -costoBebida:doublé)
(+ crearMenu( Dato:String , costos:double ) +buscarMenu (Dato:String) +EliminarMenu(String :boolean))
1.5 Mesero
(-fichaPedido:String -servicio:String -númeroMesa:int)
(+vereficarPedido(texto:String) +sirvePedido(texto:String) +recogelamesa(texto:boolean))
 

3. Crear un proyecto Java en Netbeans llamado Practica01-SuApellidoNombre y sobre el mismo codificar las 5 clases seleccionadas en java utilizando: atributos, métodos y encapsulamiento con los métodos getters and setters.  En relación a los métodos (comportamientos) estos solo deben ser declarados es decir no se requiere del procedimiento.

3.1 Proyecto Java en Netbeans llamado Practica01-SuApellidoNombre
 
3.2 Descripción de cada clase y cada método

3.2.1 Menú 
Menú es una clase donde sus métodos son los siguientes:
 
Sus atributos son los que  mostrare a continuación:
 
 Los métodos getter y setter no cuentan como métodos pero para la solución  del programa  se necesito mucho de ello que a continuación estaré detallando.
 

Mientras el código de ingreso desde la clase principal main es el siguiente.
 
3.2.2DatosCliente
Datoscliente es una clase donde sus métodos son los siguientes:
 
Sus atributos son los que mostrare a continuación:
 
El código solución y utilizando el getter y setter es el siguiente.



 
Y el código desde la principal es el siguiente.
 
3.2.4Asistencia
La Asistencia es una clase donde sus métodos son los siguientes:
 
Sus atributos son los que mostrare a continuación:
 
El código solución y utilizando el getter y setter es el siguiente siendo este el que nos permite  dar una mejor solución al programa.
 
Y el código desde la principal es el siguiente.
 


3.2.3Empleados
La Asistencia es una clase donde sus métodos son los siguientes
 
Sus atributos son los que mostrare a continuación:
 
El código solución y utilizando el getter y setter es el siguiente siendo este el que nos permite dar una mejor solución al programa.
 

Y el código desde la principal es el siguiente.
 
3.2.5mesero
La Asistencia es una clase donde sus métodos son los siguientes
 
Sus atributos son los que mostrare a continuación:
 
El código solución y utilizando el getter y setter es el siguiente siendo este el que nos permite  dar una mejor solución al programa.
 
Y el código desde la principal es el siguiente.
 

4. Implementar el método toString() en cada clase.
4.1 Menu
 
4.2 DatosCliente
 
4.3 Empleados
 
4.4 Asistencia
 
4.5 Mesero
 
5. . Programar una clase principal (tipo main) que permita crear un objeto (instanciar) de cada clase referida en el punto anterior, estableciendo/seteando los datos/valores ingresados por el usuario (usando la clase Scanner) y posterior muestre dicha información del objeto en la consola de Netbeans.

El código  estará presente y  dafo demostrado dela clase main.
 
 
 

 
 
  
6. Crear un repositorio en GitHub y subir el código del proyecto de NetBeans. En el archivo README del repositorio debe constar la misma información del informe de resultados de la práctica que se indica en el siguiente punto.
 

7 Generar informe de los resultados en el formato de prácticas. Debe incluir el desarrollo de cada uno de los puntos antes descritos. Así como también, la evidencia de la correcta ejecución del programa para lo cuál se puede generar fotografías instantáneas del código (pantallazos) y debe incluir conclusiones apropiadas. Finalmente, en el informe se debe incluir la información de GitHub y debe constar la firma digital del estudiante
  



RESULTADO(S) OBTENIDO(S):
Los resultados que hemos obtenido son los siguiente: hemos cargado toda la información en github  con la siguiente dirección  donde está más detallado y cargado  tanto como en NetBeans,https://github.com/SegundoRolando/Practica01-CalleRolando  de acuerdo a lo desarrollado se pudo realizar  lo que se pudo y también dando seguimiento a la guía práctica, logramos  realizar esta practica
CONCLUSIONES:
En conclusión de  este proyecto nos ha permitido distinguir entre una clase , un método, el importar e instanciar clases  objetos  y a su vez nos ha sido muy útil porque nos permitió también  compartir en la página  github, siendo esta la que nos permite compartir información en la web.
RECOMENDACIONES:
Que las Practicas que nos envía seas más enfocadas a llenar es  os vacíos que a lo mejor  aún no logramos llenarlo.

Nombre de estudiante: ____Rolando Calle______


Firma de estudiante: __________________
