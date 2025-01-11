package exerciciosVetores;

import java.util.Scanner;

public class PMaiorPosicao {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = ent.nextInt();

        float[] vect = new float[n];

        float maiorValor = 0;
        int posicaoMaiorValor = -1;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = ent.nextFloat();

            if(vect[i] > maiorValor) {
                maiorValor = vect[i];
            }

            if(vect[i] == maiorValor) {
                posicaoMaiorValor = i;
            }

        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaiorValor);

    }
}
