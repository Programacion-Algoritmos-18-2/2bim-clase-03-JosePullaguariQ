/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_en_clase;
/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1();            //Creamos un objeto tipo LeerArchivoTexto1
        OperacionData operacion = new OperacionData();                     //Creamos un objeto tipo OperacionData

        aplicacion.abrirArchivo();                                         //Llamamos al metodo para abrir archivo de LeerArchivoTexto1
        operacion.agregarInformacion(aplicacion.leerRegistros());          //Llamamos al metodo agregarInformacion de OperacionData
        System.out.printf("El promedio es %f", operacion.promedioCapacidades()); //Presentamos el promedio calculado en el metodo promedioCapacidades

        //aplicacion.leerRegistros();                                      //Llamamosal metodo para leer la informacion del archivo
        aplicacion.cerrarArchivo();                                        //Llamamosal metodo para cerrar el archivo abierto

    }
}
