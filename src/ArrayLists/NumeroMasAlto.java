package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class NumeroMasAlto {
    public static void main(String[] args){

        int enteroMaximo = 0;
        final int LIMITE = 100;

        Random aleatorio = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        for (int contador = 0; contador<LIMITE; contador++){
            listaEnteros.add(aleatorio.nextInt(100)+1);
        }

        for (int contador = 0; contador<listaEnteros.size(); contador++){
            if (listaEnteros.get(contador) > enteroMaximo){
                enteroMaximo = listaEnteros.get(contador);
            }
        }
        System.out.println(listaEnteros);
        System.out.println("El número más alto es: "+enteroMaximo);

    }
}
