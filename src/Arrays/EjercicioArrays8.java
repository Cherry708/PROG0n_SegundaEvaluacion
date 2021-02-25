package Arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays8 {
    public static void main(String[] args) {

        /*
         * Ejercicio de arrays 8
         *
         * Crea un array que pueda contener diez enteros y llena cada posición con diferentes valores aleatorios entre
         * el 1 y el 50. Muestra esos valores en la pantalla y luego pide al usuario un número entero. Busca el número
         * en el array: si está, indica el número de posición en el que se encuentra y, si no está, indícalo también (con
         * un único mensaje). Si el número está más de una vez, puedes mostrar el mensaje tantas veces como sea
         * necesario o mostrar un solo mensaje con el último número de posición en el que apareció.
         *
         */

        int enteroUsuario;
        String lineaUsuario;
        boolean ejecucion = true;
        boolean enteroEnLista = false; //Banderita

        int[] listaEnteros = new int[10];
        Random randomEntero = new Random();
        Scanner inputUsuario = new Scanner(System.in);

        for (int contador = 0; contador < listaEnteros.length; contador++) {
            listaEnteros[contador] = randomEntero.nextInt(50) + 1;
        }
        lineaUsuario = getString(listaEnteros, inputUsuario);

        do {

            try {
                enteroUsuario = Integer.parseInt(lineaUsuario);

                enteroEnLista = isContieneEntero(enteroUsuario, enteroEnLista, listaEnteros);

                comprobacionEntero(enteroUsuario, enteroEnLista);

                ejecucion = false;

            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Error de entrada");
                lineaUsuario = getString(listaEnteros, inputUsuario);
            }
        }while (ejecucion);
    }

    private static boolean isContieneEntero(int enteroUsuario, boolean enteroEnLista, int[] listaEnteros) {
        for (int contador = 0; contador < listaEnteros.length; contador++) {
            if (listaEnteros[contador] == enteroUsuario) {
                System.out.println("El número " + enteroUsuario + " está en la posición: " + (contador + 1));
                enteroEnLista = true; //Banderita: si el número existe en la lista nunca se dirá lo contrario
            }
        }
        return enteroEnLista;
    }

    private static void comprobacionEntero(int enteroUsuario, boolean contieneEntero) {
        if (!contieneEntero)
            System.out.println("El número " + enteroUsuario + " no está en la lista");
    }

    private static String getString(int[] listaEnteros, Scanner inputUsuario) {
        String lineaUsuario;
        System.out.println("La lista contiene: " + Arrays.toString(listaEnteros));
        System.out.println("Introduce el número a buscar: ");
        lineaUsuario = inputUsuario.next();
        return lineaUsuario;
    }
}
