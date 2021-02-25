package Ficheros;

import java.io.*;

//NO FUNCIONA
public class VocalesMayusculas {
    public static void main(String[] args) throws IOException {

        File ficheroIn = new File("D:/A_Proyectos/ProgramacionJava/PracticaExamen_2aEV/src/Ficheros/archivos/carta.txt");
        FileReader lecturaFichero = new FileReader(ficheroIn);
        BufferedReader readerFichero = new BufferedReader(lecturaFichero);
        
        PrintWriter printerFichero = new PrintWriter(ficheroIn);

        char[] listaVocales = new char[5];
        String vocales = "aeiou";
        String vocalMayuscula = null;

        //Asignamos las vocales a la lista
        for (int contador = 0; contador<listaVocales.length; contador++){
                listaVocales[contador] = vocales.charAt(contador);
        }

        String contenidoLineaFichero = "";


        while ((contenidoLineaFichero = readerFichero.readLine()) != null){
            for (int contador = 0; contador< contenidoLineaFichero.length(); contador++){
                if (contenidoLineaFichero.charAt(contador) == listaVocales[contador]){
                    vocalMayuscula = String.valueOf(contenidoLineaFichero.charAt(contador)).toUpperCase();
                }
            }
            printerFichero.println(vocalMayuscula);
        }
        readerFichero.close();
        printerFichero.close();

/*
Esto es un test
Esto es el segundo test
Este es el contenido con vcales para VocalesMayusculas
 */

    }
}
