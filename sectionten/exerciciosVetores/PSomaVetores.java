package exerciciosVetores;

import java.util.Scanner;

public class PSomaVetores {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor: ");
        int n = ent.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int[] vect3 = new int[n];

        System.out.println("Digite os valores do vetor 1: ");
        for (int i = 0; i < n; i++) {
            vect1[i] = ent.nextInt();
        }

        System.out.println("Digite os valores do vetor 2: ");
        for (int i = 0; i < n; i++) {
            vect2[i] = ent.nextInt();
            //vect3[i] = vect1[i] + vect2[i];
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vect3[i] = vect1[i] + vect2[i]);
        }





    }
}
