package Videos;

import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        String Nombre;
        //Paso 1:
        File miArchivo;
        //Paso 2:
        PrintWriter escribir;
        //Paso 3:
        miArchivo = new File("ejemploEscritura.txt");
        //Paso 4:
        if (!miArchivo.exists()) {
            //Paso 4.1
            System.out.println("El archivo se creo Exitosamente");
            try {
                miArchivo.createNewFile();
            } catch (Exception e) {
            }
            //Paso 4.2
        } else {
            //4.2.1
            System.out.println("El archivo ya Existe");
            try {
                escribir = new PrintWriter(miArchivo, "utf-8");
                //Paso 4.2.2
                Nombre = JOptionPane.showInputDialog(null, "¿Ingresa Tu Nombre?");
                escribir.println("Hola " +Nombre + " Bienvenido a la Fiesta");
                escribir.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        /*
        Algoritmo para escribir en un archivo desde java
        1.- Crear una variable de tipo File
        2.- Crear una variable de tipo PrintWrite
        3.- Prepara al archivo
        4.- Verifica si el archivo no existe 
            4.1.- Crear al Arechivo
            4.2.- En otro caso (else)
		4.2.1.- Prepara al archivo para escribir 
		4.2.2.- Escribir en el archivo 
		4.2.3.- Cerrar el archivo
        
        */
    }
}
