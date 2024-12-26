package exerciciosVetores;

import java.util.Scanner;

public class PMediaPares {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = ent.nextInt();

        int[] vet = new int[n];
        float somaPar = 0;
        int numPar = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = ent.nextInt();
            if (vet[i] % 2 == 0) {
                somaPar += vet[i];
                numPar++;
            }
        }

        float mediaPar = somaPar / numPar;
        if(somaPar == 0){
            System.out.println("Nenhum número par!");
        }else {
            System.out.println("Média dos pares: " + mediaPar);
        }

    }
}
