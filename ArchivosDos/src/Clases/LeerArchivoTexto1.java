package Clases;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import lecturaArchivosClase.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1 {
    
    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estadios.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    public ArrayList<Estadio> leerRegistros() {
        // objeto que se va a escribir en la pantalla
        ArrayList<Estadio> lista = new ArrayList<>();
        
        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine(); // nos saltamos el encabezado o la primera linea
            while (entrada.hasNext()) { // la ariable toma el valor hasta que se encuentre un espacio
                Estadio estadio = new Estadio(); // se crea el objeto estadio
                String linea = entrada.nextLine(); // la variable linea toma el valor de la liena que fue leida
                ArrayList<String> partes = new ArrayList<String>(Arrays.asList(linea.split(";"))); // designamos un separador
                estadio.setNombre(partes.get(0)); 
                estadio.setDeporte(partes.get(1));
                estadio.setCapacidad(Double.parseDouble(partes.get(2)));
                lista.add(estadio); // agregamos el objeto a la lista
                System.out.printf("%s", estadio);  // se presenta el objeto
            } // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del m�todo leerRegistros

    // lee registro del archivo
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. * * RENUNCIA: Los autores y el editor de
 * este libro han realizado su mejor * esfuerzo para preparar este libro. Esto
 * incluye el desarrollo, la * investigaci�n y prueba de las teor�as y programas
 * para determinar su * efectividad. Los autores y el editor no hacen ninguna
 * garant�a de * ning�n tipo, expresa o impl�cita, en relaci�n con estos
 * programas o * con la documentaci�n contenida en estos libros. Los autores y
 * el * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de * estos
 * programas. *
 ************************************************************************
 */
