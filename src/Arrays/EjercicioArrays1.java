package Arrays;

public class EjercicioArrays1 {
    public static void main(String[] args){

        /*
         * Ejercicio de arrays 1
         *
         * Crea un array que pueda contener diez números enteros. Llena cada posición del array con el número 211.
         * Luego muestra el contenido del array en la pantalla. Esta vez utilizarás bucles tanto para poner los valores
         * en el array como para mostrarlos. Además, en la condición del bucle no pondrás el límite con un número
         * literal (por ejemplo, 10), sino que utilizarás el atributo length del array.
         *
         */

        int entero;
        entero = 221;

        int[] listaNumeros;
        listaNumeros = new int[10];

        for (int contador = 0; contador<listaNumeros.length; contador++){
            listaNumeros[contador] = entero;
            System.out.println("La posición "+contador+" contiene "+listaNumeros[contador]);
        }
    }
}
