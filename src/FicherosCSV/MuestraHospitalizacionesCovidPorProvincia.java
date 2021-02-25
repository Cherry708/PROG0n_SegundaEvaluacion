package FicherosCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MuestraHospitalizacionesCovidPorProvincia {
    public static void main(String[] args) throws FileNotFoundException {
        //if (args.length == 1){

        /*
        En primer lugar, el programa preguntará al usuario el nombre de provincia (¡atención! En el archivo está
        codificado según normas ISO, por ejemplo, Castellón es CS) y, después, mostrará por pantalla el número
        total de hospitalizaciones por coronavirus en esa provincia.
         */

        String nombre = "";
        String lineaContenido = "";
        String[] listaContenido;
        int hospitalizaciones = 0;
        boolean existeProvincia = false;

        File ficheroEntrada = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\FicherosCSV\\archivos\\coronavirus.csv");
        FileReader ficheroLectura = new FileReader(ficheroEntrada);

        /*
        URL ficheroEntrada = new URL("http://www.cristiangarcia.org/coronavirus.csv");

        Scanner inputUsuario = new Scanner(System.in);
        Scanner scannerFichero = new Scanner(ficheroEntrada.openStream());
         */

        Scanner inputUsuario = new Scanner(System.in);
        Scanner scannerFichero = new Scanner(ficheroLectura);

        System.out.println("Introduce el nombre de la provincia");
        System.out.println("Ejemplo: ");
        System.out.println("Castellón es CS");
        nombre = inputUsuario.nextLine();


        while (scannerFichero.hasNextLine()){
            lineaContenido = scannerFichero.nextLine();
            listaContenido = lineaContenido.split(",");
            if (listaContenido[0].equals(nombre)){
                hospitalizaciones = hospitalizaciones + Integer.parseInt(listaContenido[5]);
                existeProvincia = true; //Si ha llegado aquí es que la provincia al menos es correcta
            }
        }

        if (existeProvincia) {
            System.out.println(nombre + " tiene un total de " + hospitalizaciones + " hospitalizaciones");
        } else System.out.println("El nombre ISO de provincia no se ha encontrado");


        //} else
          //  System.out.println("Parametros incorrectos");
    }
}
