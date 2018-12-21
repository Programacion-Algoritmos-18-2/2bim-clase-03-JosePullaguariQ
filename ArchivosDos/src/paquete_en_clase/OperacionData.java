/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_en_clase;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class OperacionData {                                                //Clase Operacion Data

    ArrayList<Estadio> informacion;                                         //Declaramos un ArrayList de tipo Estadio

    public void agregarInformacion(ArrayList<Estadio> info) {               //Metodo para agregar informacion al Arraylist tipo Estadio
        informacion = info;
    }

    public ArrayList<Estadio> obtenerInformacion() {                        //Metodo de obtener informacion del Arralist tipo Estadio
        return informacion;
    }

    public double promedioCapacidades() {                                   //Metodo para calcular el promedio de todas las capacidades del archivo
        double suma = 0;                                                    //Declaramos variables inicializadas en cero para almacenar la suma y promedio
        double promedio = 0;
        for (int i = 0; i < obtenerInformacion().size(); i++) {             //Creamos un for para recorrer la lista con las capacidades
            suma += obtenerInformacion().get(i).getCapacidad();             //Acumulamos las sumas de capacidad en variable suma
        }
        promedio = suma / obtenerInformacion().size();                      //Calculamos el promedio de las capacidades 
        return promedio;                                                    //Retornamos el promedio ya calculado
    }
}
