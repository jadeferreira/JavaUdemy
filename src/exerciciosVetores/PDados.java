package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class PDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int n = ent.nextInt();

        Dados[] dados = new Dados[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "a pessoa: ");
            double altura = ent.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa: ");
            char genero = ent.next().charAt(0);
            dados[i] = new Dados(altura, genero);
            System.out.println();
        }

        double maiorAlt = dados[0].getAltura();
        double menorAlt = dados[0].getAltura();

        for (int i = 0; i < n; i++) {
            if(dados[i].getAltura() > maiorAlt) {
                maiorAlt = dados[i].getAltura();
            }
            if(dados[i].getAltura() < menorAlt) {
                menorAlt = dados[i].getAltura();
            }
        }
        System.out.println("Menor altura: " + menorAlt);
        System.out.println("Maior altura: " + maiorAlt);

        double somaF = 0;
        int mulheres = 0;
        int homens = 0;

        for (int i = 0; i < n; i++) {
            if(dados[i].getSexo() == 'f'){
                somaF += dados[i].getAltura();
                mulheres++;
            }
            if(dados[i].getSexo() == 'm'){
                homens++;
            }
        }
        double mediaF = somaF / mulheres;
        System.out.printf("Média das mulheres: %.2f",mediaF, "\n");
        System.out.println("Número de homens: " + homens);

    }
}
