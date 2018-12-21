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
public class Estadio {//Creamos la clase Estadio con sus atributos
    private String nombreEstadio;
    private String tipo;
    private double capacidad;
    
    // Creamos un constructor sin argumentos que llama a otro constructor con valores predeterminados
    public Estadio() {
      this( " ", " ", 0 ); 
    }
    public Estadio(String nombE,String tip, double capac) {//Constructor de la clase Estadio para recibir parametros
        setNombreEstadio(nombE);
        setTipo(tip);
        setCapacidad(capac);
    }
    
    //Metodos de agregar y obtener para los atributos    
    public void setNombreEstadio(String nombE) {
        nombreEstadio = nombE;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setCapacidad(double capac) {
        capacidad = capac;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setTipo(String tip) {
        tipo = tip;
    }

    public String getTipo() {
        return tipo;
    } 
    
    //Creamos el metodo toString para presentar los datos de la clase Estadio
    @Override
    public String toString(){
        return String.format("Nombre: %s - Tipo: %s - Capacidad: %f  ", super.toString(), getNombreEstadio(),getCapacidad(), getTipo());
    }
}


