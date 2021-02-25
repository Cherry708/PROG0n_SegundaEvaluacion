package Arrays;

import java.util.Random;

public class EjercicioArrays2 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 2
         *
         * Crea un array que pueda contener diez números enteros. Llena cada posición del array con un número
         * aleatorio del 1 al 100. Luego, muestra el contenido del array en la pantalla. Debes usar bucles. Y, como en
         * el anterior ejercicio, utilizarás el atributo length del array y no un número literal en la condición del bucle.
         *
         */


        Random numero = new Random();
        int[] listaNumeros = new int[10];

        for (int contador = 0; contador<listaNumeros.length; contador++){
            listaNumeros[contador] = numero.nextInt(100)+1;
            System.out.println("La posición "+contador+" contiene: "+listaNumeros[contador]);
        }
    }
}
