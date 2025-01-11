package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class PAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados: ");
        int n = ent.nextInt();

        Aluno[] alunos = new Aluno[n];
        String aprovados = "";

        ent.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
            String nome = ent.nextLine();
            double nota1 = ent.nextDouble();
            double nota2 = ent.nextDouble();
            alunos[i] = new Aluno(nome, nota1, nota2);
            alunos[i].verificarNota();

        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            if(alunos[i].verificarNota()){
                System.out.println(alunos[i].getNome());
            }

        }

    }
}
