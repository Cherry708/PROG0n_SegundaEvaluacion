package Arrays;

import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays7 {
    public static void main(String[] args){

        /*
         * Ejercicio 7
         *
         * Crea un array que pueda contener diez enteros y llena cada posición con diferentes valores aleatorios entre
         * el 1 y el 50. Muestra esos valores en la pantalla y luego pide al usuario un número entero. Busca el número
         * en el array: si está, indícalo con un mensaje y, si no está, indícalo también (con un único mensaje).
         *
         */

        int enteroUsuario;
        boolean contieneNumero = false;

        int[] listaEnteros = new int[10];
        Random randomEntero = new Random();

        Scanner inputUsuario = new Scanner(System.in);

        System.out.println("La lista contiene: ");
        for (int contador = 0; contador<listaEnteros.length; contador++){
            listaEnteros[contador] = randomEntero.nextInt(50)+1;
            System.out.print(listaEnteros[contador]+", ");
        }

        System.out.println("Introduce el número a buscar: ");
        enteroUsuario = inputUsuario.nextInt();

        for (int contador = 0; contador<listaEnteros.length; contador++){
            if (listaEnteros[contador] == enteroUsuario){
                contieneNumero = true;
            }
        }

        if (contieneNumero){
            System.out.println("El número "+enteroUsuario+" está en la lista");
        } else System.out.println("El número "+enteroUsuario+" no está en la lista");

    }
}
