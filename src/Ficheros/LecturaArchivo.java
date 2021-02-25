package Ficheros;

import java.io.*;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) throws IOException {

        String nombreUsuario = "";
        String contenidoFichero = "";
        String contenidoFicheroTemporal = "";

        Scanner inputUsuario = new Scanner(System.in);

        File fichero = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombre.txt");
        File ficheroTemporal = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombreTemporal.txt");
        PrintWriter printer = new PrintWriter(fichero);
        PrintWriter printerTemporal = new PrintWriter(ficheroTemporal);


        FileReader ficherLectura = new FileReader(fichero);
        FileReader ficheroLecturaTemporal = new FileReader(ficheroTemporal);
        BufferedReader reader = new BufferedReader(ficherLectura);
        BufferedReader readerTemporal = new BufferedReader(ficheroLecturaTemporal);

        if (reader.readLine() != null){ //Si hay algo a leer lee
            contenidoFichero = reader.readLine();
            System.out.println(contenidoFichero);
        } else { //Si no hay nada a leer escribe
            System.out.println("Introduce tu nombre: ");
            nombreUsuario = inputUsuario.nextLine();
            printerTemporal.println(nombreUsuario);

            contenidoFicheroTemporal = readerTemporal.readLine();
            printer.println(contenidoFicheroTemporal);

            //Los nombres se guardan en el temporal y se copian al normal
            //Ahora tenemos que copiar los del normal en el temporal
            //Luego cambiamos el nombre de temporal a normal y borramos temporal

            contenidoFichero = reader.readLine();
            while (reader.readLine() != null){
                printerTemporal.println(contenidoFichero);
                contenidoFichero = reader.readLine();
            }

        }

        printerTemporal.close();
        printer.close();
        readerTemporal.close();
        reader.close();

        fichero.delete();
        ficheroTemporal.renameTo(fichero);

        System.out.println("Tu nombre es: "+contenidoFicheroTemporal);
    }
}
