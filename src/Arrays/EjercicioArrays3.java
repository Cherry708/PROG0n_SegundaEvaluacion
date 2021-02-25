package Arrays;

import java.util.Random;

public class EjercicioArrays3 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 3
         *
         * Crea un array que pueda contener 1000 enteros. Llena cada posición del array con números aleatorios en el
         * rango de 10 a 99. Luego muestra el contenido del array en la pantalla. Debes usar bucles. Si tienes cuidado
         * de elegir solo números aleatorios del 10 al 99 y colocar dos espacios después de cada número, la salida por
         * pantalla quedará bastante bien alineada.
         *
         */

        Random numero = new Random();
        int[] listaNumeros = new int[1000];

        for (int contador = 0; contador<listaNumeros.length; contador++){
            listaNumeros[contador] = numero.nextInt(90)+10;
            System.out.println("La posición "+contador+" contiene: "+listaNumeros[contador]);
        }
    }
}
