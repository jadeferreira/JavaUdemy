package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = ent.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = ent.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }

        System.out.println("Quantos números você vai digitar? ");
        int numeros = ent.nextInt();

        float soma = 0;
        float media = 0;

        float[] vect = new float[numeros];

        for(int i=0; i<numeros; i++) {
            System.out.println("Digite um número: ");
            vect[i] = ent.nextFloat();

        }

        System.out.println("Valores: ");

        for (int i=0; i<numeros; i++) {
            System.out.println(vect[i] + " - ");
            soma += vect[i];
        }

        media = soma / vect.length;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        System.out.println("Quantas pessoas serão digitadas: ");
        int numPessoas = ent.nextInt();

        Pessoa[] pessoas = new Pessoa[numPessoas];
        float soma2 = 0;
        int menor16 = 0;
        String pessoasMenorNome = " ";

        for (int i=0; i<numPessoas; i++) {
            System.out.println("Dados da " + (i+1) + " pessoa: ");
            System.out.println("Nome: ");
            String nome = ent.next();
            System.out.println("Altura: ");
            float altura = ent.nextFloat();
            System.out.println("Idade: ");
            int idade = ent.nextInt();

            pessoas[i] = new Pessoa(nome, altura, idade);
            soma2 += altura;

            if(pessoas[i].getIdade() < 16) {
                menor16++;
            }
        }

        float pessoasMenor = ((float) menor16 / numPessoas) * 100;
        float mediaAltura = soma2 / numPessoas;

        System.out.printf("Altura média: %.2f", mediaAltura);
        System.out.println("\nPessoas com menos de 16 anos: " + pessoasMenor + "%");

        for (int i=0; i<numPessoas; i++) {
            if(pessoas[i].getIdade() < 16) {
                System.out.printf("%s\n", pessoas[i].getNome());
            }
        }



    }
}
