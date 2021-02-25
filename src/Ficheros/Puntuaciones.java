package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Puntuaciones {
    public static void main(String[] args) throws FileNotFoundException {

        boolean ejecucion = true;
        float puntuacion;

        String puntuacionUsuario;
        String nombreUsuario;

        File fichero = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\puntuaciones.txt");
        PrintWriter printer = new PrintWriter(fichero);

        Scanner inputUsuario = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre: ");
        nombreUsuario = inputUsuario.nextLine();
        System.out.println("Por favor, introduce tu puntuación: ");
        puntuacionUsuario = inputUsuario.nextLine();

        do {
            try {

                puntuacion = Float.parseFloat(puntuacionUsuario);

                printer.println("Usuario: "+nombreUsuario);
                printer.println("Puntuación: "+puntuacion);

                System.out.println("Datos guardados con éxito.");
                System.out.println("Saliendo...");

                printer.close();
                ejecucion = false;

            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Error de entrada, la puntucación debe ser un valor numérico");
                System.out.println("Por favor, introduce tu puntuación: ");
                puntuacionUsuario = inputUsuario.nextLine();
            }
        }while (ejecucion);
    }
}
