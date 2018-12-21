/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_en_tutoria;

/**
 *
 * @author USUARIO
 */
public class Persona { //Declaramos la clase Persona con sus atributos
    private String nombre;
    private int edad;
    
    public Persona() { // Creamos un constructor sin argumentos que llama a otro constructor con valores predeterminados
      this( "", 0 ); 
   }
    public Persona(String nomb, int edad) { //Constructor de la clase Persona para recibir parametros
        setNombre(nomb);
        setEdad(edad);
    }
    
    //Metodos de agregar y obtener para los atributos    
    public void setNombre(String nomb) {
        nombre = nomb;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public int obtenerEdad() {
        return edad;
    }    
}
