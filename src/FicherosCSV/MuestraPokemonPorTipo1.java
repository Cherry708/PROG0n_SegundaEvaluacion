package FicherosCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MuestraPokemonPorTipo1 {
    public static void main(String[] args) throws IOException {
        //if (args.length == 1){

        /*
        En primer lugar, el programa preguntará al usuario el tipo de pokemon (¡atención! Los tipos están en inglés;
        por ejemplo, fire) y después generará un archivo de texto nombres.txt en el que se incluirán los nombres de
        todos los pokemons que pertenecen al tipo 1 (¡atención de nuevo! En el archivo está en inglés, type 1).
         */


            String tipo = "";
            String lineaFichero = "";
            String[] listaContenido;

            File ficheroEntrada = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\FicherosCSV\\archivos\\pokemon.csv");
            File ficheroSalida = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\FicherosCSV\\archivos\\nombres.txt");

            FileReader ficheroLectura = new FileReader(ficheroEntrada);
            FileWriter ficheroEscritura = new FileWriter(ficheroSalida);

            PrintWriter printerFichero = new PrintWriter(ficheroEscritura);

            Scanner inputUsuario = new Scanner(System.in);
            Scanner scannerFichero = new Scanner(ficheroLectura);

            System.out.println("Selecciona el tipo de pokemon");
            System.out.println("Fire");
            System.out.println("Grass");
            System.out.println("Water");
            tipo = inputUsuario.nextLine();

            while (scannerFichero.hasNextLine()){
                lineaFichero = scannerFichero.nextLine();
                listaContenido = lineaFichero.split(",");
                if (listaContenido[4].equals(tipo)){
                    printerFichero.println(listaContenido[3]);
                }
            }
            printerFichero.close();

        //} else
            //System.out.println("Introduce los parámetros correctamente");


    }
}
