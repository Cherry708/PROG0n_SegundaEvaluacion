package Arrays;

import java.util.Arrays;
import java.util.Random;

public class EjercicioArrays4 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 4
         *
         * Escribe un programa que cree un array de diez enteros y llena cada posición con números aleatorios del 1
         * al 100. Después, copia todos los elementos de ese array en otro array del mismo tamaño. Finalmente,
         * muestra el contenido de ambos arrays. Para diferenciar un array del otro (y comprobar que la copia se ha
         * hecho correctamente)
         */

        Random numero = new Random();
        int[] listaNumeros = new int[10];
        int[] copiaListaNumeros = new int[10];

        for (int contador = 0; contador<listaNumeros.length; contador++){
            listaNumeros[contador] = numero.nextInt(100)+1;
            copiaListaNumeros[contador] = listaNumeros[contador];
        }

        listaNumeros[listaNumeros.length-1] = -7;


        System.out.println(Arrays.toString(listaNumeros));
        System.out.println(Arrays.toString(copiaListaNumeros));

    }
}
