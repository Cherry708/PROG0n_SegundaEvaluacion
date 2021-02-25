package Ficheros.archivos;

import java.io.*;
import java.util.Scanner;

public class LecturaArchivo2 {
    public static void main(String[] args) throws IOException {

        String nombre = "";
        String contenido = "";

        //File solo determina el path, no crea nada. Se crea con el printer, que genera un Stream
        File ficheroFinal = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombre.txt");
        File ficheroTemporal = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\nombreTemporal.txt");

        FileReader ficheroLecturaFinal;
        FileReader ficheroLecturaTemporal;

        BufferedReader readerFinal; // = new BufferedReader(ficheroLecturaFinal);
        BufferedReader readerTemporal; // = new BufferedReader(ficheroLecturaTemporal);

        PrintWriter printerFinal; // = new PrintWriter(ficheroFinal);
        PrintWriter printerTemporal; // = new PrintWriter(ficheroTemporal);

        Scanner inputUsuario = new Scanner(System.in);

        /*
        Lo que escriba se hará en el temporal y más tarde se copiará en el final.
        Para que el final no se borre, siempre hay que copiar el final en el temporal.
        Es decir, el temporal será el final más el nuevo.
         */

        System.out.println("Introduce tu nombre: ");
        nombre = inputUsuario.nextLine();

        if (!ficheroFinal.exists()){

            //Si el fichero no existe lo creo e imprimo en él
            printerFinal = new PrintWriter(ficheroFinal);
            printerFinal.println(nombre);
            printerFinal.close();
            System.out.println("El fichero aun no existe");

        } else {

            // Si el fichero existe lo pego en temporal
            printerTemporal = new PrintWriter(ficheroTemporal);
            ficheroLecturaFinal = new FileReader(ficheroFinal);
            readerFinal = new BufferedReader(ficheroLecturaFinal);


            contenido = readerFinal.readLine();
            printerTemporal.println(contenido);


            //Se pega el Final en el Temporal
            /*
            Hay que asignar la linea que se lee previamente a una variable para almacenarla
            y así que se pueda imprimir sin saltarnos ninguna línea.
            De no ser por '(contenido = readerFinal.readLine())' siempre nos saltaríamos una línea
             */
            while ((contenido = readerFinal.readLine()) != null){
                printerTemporal.println(contenido);
            }


            /* Esta es otra forma de loop pero no he conseguido que funcione
            for (contenido = readerFinal.readLine(); readerFinal.readLine() != null ; contenido = readerFinal.readLine()){
                System.out.println(contenido);
            }
            */

            //Imprime el nuevo dato, el último introducido
            printerTemporal.println(nombre);

            //Nos aseguramos de que los streams abiertos se cierren
            printerTemporal.close();
            readerFinal.close();

            ficheroFinal.delete();
            ficheroTemporal.renameTo(ficheroFinal);
            System.out.println("Terminado");

        }
    }
}
// Con la entrada 3, la 2 se hace null