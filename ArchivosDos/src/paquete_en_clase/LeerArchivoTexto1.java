package paquete_en_clase;

// Este programa lee un archivo de texto y muestra cada registro.
import lecturaArchivosClase.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1 {                                                //Clase LeerArchivoTexto1

    private Scanner entrada;                                                    //declaramos una variable global entrada tipo Scanner

    // Metodo que permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estadios.txt"));                    //direccion y nombre del archivo a leer
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {                   //Creacion de excecion
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo abrirArchivo

    // Metodo para leer registros del archivo    
    public ArrayList<Estadio> leerRegistros() {
        ArrayList<Estadio> lista = new ArrayList<>();                           //Creamos un Arraylist lista tipo Estadio
        OperacionData operacion = new OperacionData();                          //Creamos un objeto operacion tipo OperacionData
        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext())                                               //Recorre el archivo sin saber el limite de lineas
            {
                Estadio e = new Estadio();                                          //Creamos un objeto tipo Estadio
                String linea = entrada.nextLine();                                  //Usamos el nextLine para leer una linea hasta que encuentre un salto de linea
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));  //Separamos la cadena con un split con el caracter de ";"
                e.setNombreEstadio(linea_partes.get(0));                            //agregamos la informacion que este en la lista en la posicion 0
                e.setTipo(linea_partes.get(1));                                     //agregamos la informacion que este en la lista en la posicion 1
                e.setCapacidad(Double.parseDouble(linea_partes.get(2)));            //transformamos en double a la posicion 2 del arraylist
                lista.add(e);                                                       //agregamos a la lista el objeto e tipo Estadio
            } // fin de while
            
            operacion.agregarInformacion(lista);                                    //enviamos la lista al metodo agregarInformacion  del objeto tipo OperacionData 
        } // fin de try
        catch (NoSuchElementException elementException) {                           //Creacion de excepciones
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    }
    // fin del metodo leerRegistros

    // Metodo que cierra el archivo y termina la aplicacion    
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto
