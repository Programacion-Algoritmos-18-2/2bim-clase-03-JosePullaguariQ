package lecturaArchivosClase;

// Este programa prueba la clase LeerArchivoTexto.
public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        //Creamos un objeto aplicacion tipo LeerArchivoTexto
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        
        //Llamamos a los metodos del objeto aplicacion
        aplicacion.abrirArchivo();
        aplicacion.leerRegistros(); 
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto