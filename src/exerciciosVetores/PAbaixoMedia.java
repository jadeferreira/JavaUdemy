package exerciciosVetores;

import java.util.Scanner;

public class PAbaixoMedia {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = ent.nextInt();

        float[] vet = new float[n];

        float mediaVetor = 0;
        float soma = 0;
        float elementosAbaixo = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = ent.nextFloat();
            soma += vet[i];
        }
        mediaVetor = soma / vet.length;
        System.out.println("Média do vetor: " + mediaVetor);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < n; i++) {
            if(vet[i] < mediaVetor) {
                elementosAbaixo = vet[i];
                System.out.println(elementosAbaixo);
            }
        }

    }
}
