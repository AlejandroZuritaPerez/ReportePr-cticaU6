package Videos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File documento;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", direccion = "", email = "";
        documento = new File("Usuarios.txt"); //preparando al archivo
        if (!documento.exists()) {
            try {
                documento.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "¿Ingresa tu Nombre?"
                        , "SOLICITANDO DATOS" , 3);
                direccion = JOptionPane.showInputDialog(null, "¿Ingresa tu Direccion?"
                        , "SOLICITANDO DATOS" , 3);
                email = JOptionPane.showInputDialog(null, "¿Ingresa tu Email?"
                        , "SOLICITANDO DATOS" , 3);
                escribir = new FileWriter(documento, true);
                linea = new PrintWriter(documento);
                //escribimos en el documento
                linea.println(nombre);
                linea.println(direccion);
                linea.println(email);
                linea.close();
                escribir.close();
            } catch (Exception e) {
            }
        } else {
            try {

                nombre = JOptionPane.showInputDialog(null, "¿Ingresa tu Nombre?"
                        , "SOLICITANDO DATOS" , 3);
                direccion = JOptionPane.showInputDialog(null, "¿Ingresa tu Direccion?"
                        , "SOLICITANDO DATOS" , 3);
                email = JOptionPane.showInputDialog(null, "¿Ingresa tu Email?"
                        , "SOLICITANDO DATOS" , 3);
                escribir = new FileWriter(documento, true);
                linea = new PrintWriter(documento);
                //escribimos en el documento
                linea.println(nombre);
                linea.println(direccion);
                linea.println(email);
                linea.close();
                escribir.close();
            } catch (Exception e) {
            }
        }

    }
}
