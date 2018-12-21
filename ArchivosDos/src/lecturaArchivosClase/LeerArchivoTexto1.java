package lecturaArchivosClase;

// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1 {

    private Scanner entrada;                                               //declaramos una variable global entrada tipo Scanner

    // Metodo que permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("provincias_ecuador.txt"));     //direccion y nombre del archivo a leer
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {              //Declaracion de excepcion
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // Metodo que lee registro del archivo
    public void leerRegistros() {
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) //Recorre el archivo sin saber el limite de lineas
            {
                String linea = entrada.nextLine();                      //usamos el nextLine para leer una linea hasta un salto de linea
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));  //Separamos la cadena con un split con el caracter de ;
                System.out.println(linea_partes);

            } // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {               //Declaracion de excepciones
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros

    // Metodo que cierra el archivo y termina la aplicacion
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto
