/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author David Lopez
 */
// clase Estadio
public class Estadio {
    // Se declara los atributos de la Clase 
    String nombre;
    double capacidad;
    String deporte;
    
    // Constructor que da a los atributos un valor inicial
    public Estadio() {
        this("", "", 0);
    }
    // Constructor de los atributos
    public Estadio(String n, String d, double c) {
        setNombre(n);
        setCapacidad(c);
        setDeporte(d);
    }
    // metodos para agregar la informacion a los atributos 
    public void setNombre(String n) {
        nombre = n; // se agrega el nombre del estadio
    }

    public void setCapacidad(double c) {
        capacidad = c; // se agrega  la capacidad del estadio
    }

    public void setDeporte(String d) {
        deporte = d; // se agrega el tipo de deporte

    }
    // metodos para obtener la informacion y devolver
    public String getNombre() {
        return nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getDeporte() {
        return deporte;
    }
    // metodo para presentar la informacion
    @Override
    public String toString(){
        String cadena = "";
        cadena = String.format("%s - %.2f - %s\n", getNombre(), getCapacidad(),getDeporte());
        return cadena;
    }

}
