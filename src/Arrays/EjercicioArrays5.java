package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays5 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 5
         *
         * Crea un array que pueda contener diez enteros y llena cada posición con diferentes valores aleatorios entre
         * el 1 y el 50. Muestra esos valores en la pantalla y luego pide al usuario un número entero. Busca en el array
         * y, si el valor existe, muestra un mensaje. No es necesario mostrar nada si no se encontró el valor. Si el
         * elemento está en el array varias veces, también sería correcto si el programa muestra el mensaje más de
         * una vez.
         *
         */

        int enteroUsuario;
        Random numero = new Random();
        int[] listaNumeros = new int[10];

        Scanner inputUsuario = new Scanner(System.in);

        for (int contador = 0; contador<listaNumeros.length; contador++){
            listaNumeros[contador] = numero.nextInt(50)+1;
        }

        System.out.println("Este es el contenido de la lista: "+Arrays.toString(listaNumeros));
        System.out.println("Introduce un entero y lo buscaré: ");
        enteroUsuario = inputUsuario.nextInt();

        for (int contador = 0; contador<listaNumeros.length; contador++){
            if (listaNumeros[contador] == enteroUsuario){
                System.out.println("El número "+listaNumeros[contador]+" sí está en la lista.");
            }
        }

    }
}
