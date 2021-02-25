package Arrays;

import java.util.Random;

public class EjercicioArrays9 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 9
         *
         * Crea un array que pueda contener diez enteros y llena cada posición con diferentes valores aleatorios entre
         * el 1 y el 100. Muestra esos valores en la pantalla. Luego utiliza una búsqueda lineal para encontrar el valor
         * más grande en el array y muestra ese valor. Aquí tienes una muestra de ejecución:
         *
         */

        int[] listaEnteros = new int[10];
        Random enteroRandom = new Random();

        int numeroAlto = 0; //Inicializamos el número más alto como 0

        System.out.print("Array: ");
        for (int contador = 0; contador<listaEnteros.length; contador++){
            listaEnteros[contador] = enteroRandom.nextInt(100)+1;
            System.out.print(listaEnteros[contador]+" ");
        }

        for (int contador = 0; contador<listaEnteros.length; contador++){
            //Si el elemento del array en la posición contador es mayor al numero más alto inicial, este toma su valor
            if (listaEnteros[contador]>numeroAlto){
                numeroAlto = listaEnteros[contador];
            }
        }
        System.out.println("");
        System.out.println("El número más alto es: "+numeroAlto);

    }
}
