package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays6 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 6
         *
         * Crea un array que pueda contener diez enteros y llena cada posición con diferentes valores aleatorios entre
         * el 1 y el 50. Muestra esos valores en la pantalla y luego pide al usuario un número entero. Busca en el array
         * y cuenta el número de veces que se encuentra el valor
         *
         */

        int enteroUsuario;
        int repeticion = 0;

        int[] listaNumeros = new int[10];
        Random numero = new Random();
        Scanner inputUsuario = new Scanner(System.in);

        for (int contador = 0; contador<listaNumeros.length; contador++){
            listaNumeros[contador] = numero.nextInt(50)+1;
        }

        System.out.println("El contenido de la lista es: "+Arrays.toString(listaNumeros));
        System.out.println("Introduce el número a buscar: ");
        enteroUsuario = inputUsuario.nextInt();

        for (int contador = 0; contador<listaNumeros.length; contador++){
            if (listaNumeros[contador] == enteroUsuario){
                repeticion = repeticion+1;
            }
        }
        System.out.println("El número "+enteroUsuario+" está "+repeticion+" veces");

    }
}
