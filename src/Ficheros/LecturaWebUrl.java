package Ficheros;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LecturaWebUrl {
    public static void main(String[] args) throws IOException {

        URL enlaceUrl = new URL("http://www.cristiangarcia.org/cristian.txt");
        Scanner lecturaWeb = new Scanner(enlaceUrl.openStream());

        String contenidoLineaWeb = lecturaWeb.nextLine();

        lecturaWeb.close();

        System.out.println(contenidoLineaWeb);

    }
}
