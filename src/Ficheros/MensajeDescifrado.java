package Ficheros;

import java.io.*;

public class MensajeDescifrado {
    public static void main(String[] args) throws IOException {

        /*
        Abre un archivo especificado por el usuario. Este archivo contendrá una serie de palabras. Debes leer cada
        carácter del archivo, un único carácter a la vez. Y mostrar uno de cada tres caracteres en la pantalla (los
        otros caracteres los debes ignorar).
         */

        File ficheroIn = new File("D:\\A_Proyectos\\ProgramacionJava\\PracticaExamen_2aEV\\src\\Ficheros\\archivos\\mensajeCifrado.txt");
        FileReader lecturaFichero = new FileReader(ficheroIn);
        BufferedReader readerFichero = new BufferedReader(lecturaFichero);

        PrintWriter printerFichero = new PrintWriter(ficheroIn);

        int salto = 3;

        String contenidoLinea = readerFichero.readLine();
        while (contenidoLinea != null){
            for (int contador = 0; contador<contenidoLinea.length(); contador++){
                printerFichero.print(contenidoLinea.charAt(salto));
                contenidoLinea = readerFichero.readLine();
                salto++;
            }
        }
        lecturaFichero.close();
        readerFichero.close();
        printerFichero.close();

        /*
        FTEuesn_tceeis_otenasas_,_e_alpc_eemrreocn_asenasdjtoee___,dn_eops_ecerisof__refalad_lomt_eadn_esusa
        ndj_eec__acdrieafscrctaiedfror_.amtdaxost
         */

    }
}
