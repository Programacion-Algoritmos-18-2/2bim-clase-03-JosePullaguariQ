package paquete_en_tutoria;
// Prueba de la clase CrearArchivoTexto.
public class PruebaCrearArchivoTexto {

    public static void main(String args[]) {
        //Creamos un objeto aplicacion tipo CrearArchivoTexto
        CrearArchivoTexto aplicacion = new CrearArchivoTexto(); 
        
        //Llamamos a los metodos del objeto
        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros();
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaCrearArchivoTexto