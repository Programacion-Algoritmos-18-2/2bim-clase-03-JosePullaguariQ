package lecturaArchivosClase;

// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto {

    private Scanner entrada;                                              //declaramos una variable global entrada tipo Scanner

    // Metodo que permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("clientes3.txt"));             //direccion y nombre del archivo a leer
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {             //Declaracion de excepcion
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo abrirArchivo

    // Metodo que lee registro del archivo
    public void leerRegistros() {
        // objeto que se va a escribir en la pantalla
        RegistroCuenta registro = new RegistroCuenta();

        System.out.printf("%-9s%-15s%-18s%10s\n", "Cuenta",
                "Primer nombre", "Apellido paterno", "Saldo");

        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {                                         //Recorre el archivo sin saber el limite de lineas
                registro.establecerCuenta(entrada.nextInt());                   // lee el numero de cuenta
                registro.establecerPrimerNombre(entrada.next());                // lee el primer nombre
                registro.establecerApellidoPaterno(entrada.next());             // lee el apellido paterno
                registro.establecerSaldo(entrada.nextDouble());                 // lee el saldo

                // Muestra el contenido del registro
                System.out.printf("%-9d%-15s%-18s%10.2f\n",
                        registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
                        registro.obtenerApellidoPaterno(), registro.obtenerSaldo());
            } // fin de while
        } // fin de try
        
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros

    // Metodo que lee registro del archivo
    public void leerRegistros2() {
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {                                         //Recorre el archivo sin saber el limite de lineas
                String linea = entrada.nextLine();                              //Usamos el nextLine para leer una linea hasta que encuentre un salto de linea
                System.out.println(linea);                                      //Presentamos la linea
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));//Separamos la cadena con un split con el caracter de ";"
                System.out.println(linea_partes);                               //Presentamos la separado por el split
            } // fin de while
        } // fin de try
        
        catch (NoSuchElementException elementException) {                       //Creacion de excepcion
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    
    // Metodo que cierra el archivo y termina la aplicacion
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto
