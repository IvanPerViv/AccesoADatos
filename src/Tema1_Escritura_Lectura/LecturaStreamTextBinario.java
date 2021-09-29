package Tema1_Escritura_Lectura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alumno Tarde
 */
public class LecturaStreamTextBinario {
    public static void main(String[] args) {
        int byteLeido = 0;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("hola.txt");
            while((byteLeido = fis.read()) != -1){
                System.out.println(byteLeido);
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
                if(fis != null)fis.close();    
            } 
            catch (IOException ex) {
                System.out.println("Error al cerar el fichero.");
            }
        }
    }
}
