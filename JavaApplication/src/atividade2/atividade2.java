package atividade2;

import java.time.Clock;

public class atividade2 {

    public static void main(String[] args) {

        int vetor[][] = {{1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25},
        {26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35},
        {36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45},
        {46, 47, 48, 49, 50}
        };

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[0].length; j++) {
                System.out.print(vetor[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
