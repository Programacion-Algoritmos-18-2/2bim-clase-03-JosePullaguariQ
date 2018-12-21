package paquete_en_tutoria;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CrearArchivoTexto {//Clase CrearArchivoTexto
    private Formatter salida;                                                   //Creamos globalmente una salida tipo formatter
                                                                                //usado para enviar texto al archivo
    // Metodo que permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("persona.txt");                              //direccion y nombre del archivo a crear
        } // fin de try
        catch (SecurityException securityException) {                           //creacion de excepcion
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // Metodo que agrega registros al archivo
    public void agregarRegistros() {
        // Creacion de objeto que se va a escribir en el archivo
        Persona registro = new Persona();
        Scanner entrada = new Scanner(System.in);                               //Declaracion para leer por teclado        
        boolean bandera = true;
        while (bandera == true) // itera hasta encontrar el indicador de fin de archivo
        {
            try // envia valores al archivo
            {
                // obtiene los datos que se van a enviar
                System.out.println("Ingrese el nombre");
                registro.setNombre(entrada.next());                             // lee el numero de cuenta y lo envia al metodo que agrega el nombre
                System.out.println("Ingrese la edad");
                registro.setEdad(entrada.nextInt());                            // lee la edad y lo envia al metodo que agrega la edad 

                
                // escribe el nuevo registro con los datos obtenidos
                salida.format("%s %d", registro.obtenerNombre(),
                        registro.obtenerEdad());
                
                //Preguntamos si desea ingresar mas registros o sale del ciclo while
                System.out.println("Desea ingresar más cuentas si (1), no(2)");
                int valor = entrada.nextInt();
                if (valor == 2) {
                    bandera = false;
                }
            } // fin de try
            
            catch (FormatterClosedException formatterClosedException) {         
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch
        } // fin de while
    } // fin del metodo agregarRegistros

    // Metodo que cierra el archivo
    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase CrearArchivoTexto