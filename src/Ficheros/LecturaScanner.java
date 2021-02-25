package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaScanner {
    public static void main(String[] args) throws FileNotFoundException {

        String contenido = "";

        /* Lee el fichero aún sin stream de datos?
        File fichero = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombre.txt");
        Scanner lectura = new Scanner(fichero);
        while (lectura.hasNext()){
            contenido = lectura.nextLine();
            System.out.println(contenido);
        }
        */

        /* Lee el fichero desde un inputStream de chars
        File fichero = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombre.txt");
        FileReader ficheroLectura = new FileReader(fichero);
        Scanner lecturaFichero = new Scanner(ficheroLectura);

        while (lecturaFichero.hasNext()){
            contenido = lecturaFichero.nextLine();
            System.out.println(contenido);
        }
        */

        // Lee el fichero desde un inputStream de bytes
        /*
        File fichero = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombre.txt");
        FileInputStream ficheroLectura = new FileInputStream(fichero);
        Scanner lecturaFichero = new Scanner(ficheroLectura);

        while (lecturaFichero.hasNext()){
            contenido = lecturaFichero.nextLine();
            System.out.println(contenido);
        }
        lecturaFichero.close();
        */
    }
}
