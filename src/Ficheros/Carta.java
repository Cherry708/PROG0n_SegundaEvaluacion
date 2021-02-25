package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Carta {
    public static void main(String[] args) throws FileNotFoundException {

        File fichero = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\carta.txt");
        PrintWriter printer = new PrintWriter(fichero);

        printer.println("Esto es un test");
        //Una vez se cierra el flujo no se puede volver a escribir
        printer.println("Esto es el segundo test");
        printer.close();

    }
}
