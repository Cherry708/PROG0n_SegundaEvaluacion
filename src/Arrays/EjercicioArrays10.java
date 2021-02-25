package Arrays;

import java.util.Random;

public class EjercicioArrays10 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 10
         *
         * Crea un array que pueda contener diez enteros y llena cada posición con diferentes valores aleatorios entre
         * el 1 y el 100. Muestra esos valores en la pantalla. Luego utiliza una búsqueda lineal para encontrar el valor
         * más grande en el array y muestra ese valor y la posición en la que se encuentra.
         *
         */

        int enteroAlto = 0;
        int posicion = 0;

        int[] listaEnteros = new int[10];
        Random enteroRandom = new Random();


        System.out.print("Array: ");
        for (int contador = 0; contador<listaEnteros.length; contador++){
            listaEnteros[contador] = enteroRandom.nextInt(100)+1;
            System.out.print(listaEnteros[contador]+" ");
        }

        for (int contador = 0; contador<listaEnteros.length; contador++){
            if (listaEnteros[contador]>enteroAlto){
                enteroAlto = listaEnteros[contador];
            }
        }

        for (int contador = 0; contador<listaEnteros.length; contador++){
            if (listaEnteros[contador] == enteroAlto)
                posicion = contador;
        }
        System.out.println("");
        System.out.println("El número más alto es: "+enteroAlto+" y está en la posición: "+(posicion+1));
        System.out.println("Anotación: la posición se está contado desde 1.");



    }
}
