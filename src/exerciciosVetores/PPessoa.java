package exerciciosVetores;

import java.util.Scanner;

public class PPessoa {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantas pessoas vai digitar: ");
        int n = ent.nextInt();

        int maisVelho = 0;

        Pessoa[] pessoa = new Pessoa[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println("Nome: ");
            String nome = ent.next();
            System.out.println("Idade: ");
            int idade = ent.nextInt();
            pessoa[i] = new Pessoa(nome, idade);

            if (pessoa[i].getIdade() > maisVelho) {
                maisVelho = pessoa[i].getIdade();
            }
        }

        System.out.println("Pessoa mais velha: ");
        for (int i = 0; i < n; i++) {
            if (pessoa[i].getIdade() == maisVelho) {
                System.out.println(pessoa[i].getNome());
            }
        }

    }
}
