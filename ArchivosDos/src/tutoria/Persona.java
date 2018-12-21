/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria;

/**
 *
 * @author David Lopez
 */
public class Persona {

    String nombre;
    int edad;

    public Persona() {
        this("", 0); // llama al constructor con cuatro argumentos
    }

    public Persona(String n, int e) {
        setNombre(n);
        setEdad(e);
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
