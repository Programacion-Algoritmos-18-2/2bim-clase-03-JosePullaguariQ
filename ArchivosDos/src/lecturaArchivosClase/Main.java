/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivosClase;
/**
 *
 * @author USUARIO
 */
public class Main {

    public static void main(String[] args) {
        LeerArchivoTexto1 obj = new LeerArchivoTexto1();           //Creamos un objeto tipo LeerArchivoTexto1 y llamamos a los metodos
        obj.abrirArchivo();                                        //Llamamos al metodo para abrir archivo
        obj.leerRegistros();                                       //Llamamos al metodo para leer la informacion del archivo
        obj.cerrarArchivo();                                       //Llamamos al metodo para cerrar el archivo abierto
    }
}
