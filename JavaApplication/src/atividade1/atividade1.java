package atividade1;
import java.util.Random;

public class atividade1 {

    public static void main(String[] args) {

        int[] vetorNumeros = new int[20];
        int[] vetorNumerosPar = new int[20];
        Random random = new Random();

        for (int i = 0; i < vetorNumeros.length; i++) {
            vetorNumeros[i] = random.nextInt(50);
            if (vetorNumeros[i] % 2 == 0) {
                vetorNumerosPar[i] = vetorNumeros[i];
            } else {
                vetorNumerosPar[i] = 0;
            }
        }

        for (int i = 0; i < vetorNumerosPar.length; i++) {
            System.out.print("[" + vetorNumerosPar[i] + "]");

        }

    }
}
