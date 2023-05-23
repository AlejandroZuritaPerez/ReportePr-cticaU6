package Videos;

import java.io.*;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        String MensajeEscribir = "Esta frase tiene que escribirse y despues leerse";
        String MensajeLeido = "";
        
        try {
            FileWriter fichero = new FileWriter("CursoBasicoJava.txt");
            fichero.write(MensajeEscribir);
            fichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            FileReader lector = new FileReader("CursoBasicoJava.txt");
            BufferedReader BR = new BufferedReader(lector);
            MensajeLeido = BR.readLine();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("El mensaje guardado en el texto es: " +MensajeLeido);
        
    }
}
