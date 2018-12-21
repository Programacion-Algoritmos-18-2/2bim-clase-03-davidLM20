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
public class Main { // clase principal
    public static void main(String[] args) {
        
        LeerArchivoTexto1 archivo = new LeerArchivoTexto1(); //Se crea un objeto para abrir el archivo 
        OperacionData operaciones = new OperacionData(); // Se crea un objeto tipo operacioneData
        
        archivo.abrirArchivo(); // se llama el metodo de abrir archivo
        operaciones.agregarInformacion(archivo.leerRegistros()); 
        operaciones.obtenerInformacion(); // se obtiene la informacion
        
        System.out.printf("El promedio es: %.2f\n",operaciones.PromedioCapacidad());// se presenta el proedio
        archivo.cerrarArchivo(); // se cierra el archivo
    }
    
}
