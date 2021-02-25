package FicherosSerializados;

import FicherosSerializados.Cliente;

import java.io.*;
import java.util.Scanner;

public class ControladorCliente {
    public static void main (String[] args) throws IOException, ClassNotFoundException {

        boolean ejecucion = true;

        String nombre = "";
        int edad;

        Cliente clienteNuevo;
        Cliente clienteLectura;

        File fichero = new File("cliente.info");
        File ficheroTemporal = new File("clienteTemporal.info");

        FileInputStream inputFichero;
        FileOutputStream outputFichero;

        ObjectInputStream streamEntrada = null;
        ObjectOutputStream streamSalida = null;

        Scanner inputUsuario = new Scanner(System.in);

        do {

            try {


                if (!fichero.exists()) {

                    System.out.println("Introduce el nombre: ");
                    nombre = inputUsuario.nextLine();
                    System.out.println("Introduce la edad: ");
                    edad = inputUsuario.nextInt();
                    clienteNuevo = new Cliente(nombre, edad);

                    outputFichero = new FileOutputStream(fichero);
                    streamSalida = new ObjectOutputStream(outputFichero);
                    streamSalida.writeObject(clienteNuevo);

                } else {

                    inputFichero = new FileInputStream(fichero);
                    streamEntrada = new ObjectInputStream(inputFichero);
                    clienteLectura = (Cliente) streamEntrada.readObject();
                    System.out.println(clienteLectura.toString());
                }
            }catch (ClassNotFoundException e){
                System.out.println("No se ha encontrado la clase");
            }

            ejecucion = false;
        }while (ejecucion);


    }
}
