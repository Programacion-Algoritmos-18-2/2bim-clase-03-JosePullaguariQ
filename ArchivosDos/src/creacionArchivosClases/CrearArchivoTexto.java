package creacionArchivosClases;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearArchivoTexto { //Clase CrearArchivoTexto
    private Formatter salida;                                                   //Creamos globalmente una salida tipo formatter
                                                                                //usado para enviar texto al archivo
    // Metodo que permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("clientes3.txt");                            //direccion y nombre del archivo a crear
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
        RegistroCuenta registro = new RegistroCuenta();
        Scanner entrada = new Scanner(System.in);                               //Declaracion para leer por teclado        

        System.out.printf("%s\n%s\n%s\n%s\n\n",
                "Para terminar la entrada, escriba el indicador de fin de archivo ",
                "cuando se le pida que escriba los datos de entrada.",
                "En UNIX/Linux/Mac OS X escriba <ctrl> d y oprima Intro",
                "En Windows escriba <ctrl> z y oprima Intro");

        // System.out.printf( "%s\n%s", 
        //    "Escriba el numero de cuenta (> 0), primer nombre, apellido paterno y saldo.",
        //   "? " );
        boolean bandera = true;
        // while ( entrada.hasNext() ) // itera hasta encontrar el indicador de fin de archivo
        while (bandera == true) // itera hasta encontrar el indicador de fin de archivo
        {
            try // envia valores al archivo
            {
                // obtiene los datos que se van a enviar
                System.out.println("Ingrese el número de la cuenta (debe ser entero)");
                registro.establecerCuenta(entrada.nextInt());                   // lee el numero de cuenta
                System.out.println("Ingrese el nombre del cliente");
                registro.establecerPrimerNombre(entrada.next());                // lee el primer nombre
                System.out.println("Ingrese el apellidos del cliente");
                registro.establecerApellidoPaterno(entrada.next());             // lee el apellido paterno
                System.out.println("Ingrese el saldo del cliente (cantidad con decimales)");
                registro.establecerSaldo(entrada.nextDouble());                 // lee el saldo

                if (registro.obtenerCuenta() > 0) {
                    // escribe el nuevo registro
                    salida.format("%d %s %s %.2f\n", registro.obtenerCuenta(),
                            registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),
                            registro.obtenerSaldo());
                } // fin de if
                else {
                    System.out.println(
                            "El numero de cuenta debe ser mayor que 0.");
                } // fin de else
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

    //  Metodo que cierra el archivo
    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase CrearArchivoTexto