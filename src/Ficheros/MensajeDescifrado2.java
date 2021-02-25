package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MensajeDescifrado2 {
    public static void main(String[] args) throws FileNotFoundException {

        String ruta = "D:/A_Proyectos/ProgramacionJava/PracticaExamen_2aEV/src/Ficheros/archivos/";
        String archivo = "";
        String contenidoLinea = "";
        char caracter;
        int salto = 2;

        Scanner inputUsuario = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero: ");
        archivo = inputUsuario.nextLine();

        ruta = ruta.concat(archivo);
        System.out.println(ruta);

        File ficheroIn = new File(ruta);
        Scanner scannerFichero = new Scanner(ficheroIn);



        while (scannerFichero.hasNext()){
            contenidoLinea = scannerFichero.nextLine();
            for (int contador = 0; contador<contenidoLinea.length(); contador++){
                if (contador % 3 == 0){
                    caracter = contenidoLinea.charAt(contador);
                    System.out.print(caracter);
                }


                /*caracter = contenidoLinea.charAt(salto);
                salto++;
                System.out.print(caracter);
                 */
            }

            /*
            for (int contador = 0; contador<(contenidoLinea = scannerFichero.nextLine()).length(); contador++ ){
                caracter = contenidoLinea.charAt(salto);
                salto++;
                System.out.println(caracter);
            }

             */

            /*contenidoLinea = scannerFichero.nextLine();
            caracter = contenidoLinea.charAt(salto);
            salto++;
            System.out.print(caracter);

             */
        }


    }
}
