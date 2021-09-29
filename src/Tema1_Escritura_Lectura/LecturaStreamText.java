package Tema1_Escritura_Lectura;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Alumno Tarde
 * 
 InputStream             OutputStream         (leen y escriben bytes)
 |_ObjectInputStream     |_ObjectOutputStream (serialización)
 |_FileInputStream       |_FileOutputStream   (acceso a ficheros)
 |_FilterInputStream     |_FilterOutputStream (filtros)
   |_DataInputStream       |_DataOutputStream (tipos primi.)
                           |_PrintStream      (escribir chars) 
 */

public class LecturaStreamText {
    public static void main(String[] args) {
        int caracter = 0;
        FileReader fr = null;
        try{
            fr = new FileReader("hola.txt");
            while((caracter = fr.read()) !=-1){
                System.out.print((char) caracter);
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("El fichero no se ha encontrado.");
        } 
        catch (IOException ex) {
            System.out.println("Error de lectura");
        } 
        finally {
            try {
                if(fr != null)fr.close();    
            } 
            catch (IOException ex) {
                System.out.println("El fichero no se ha encontrado.");
            }
        }
    }
}
