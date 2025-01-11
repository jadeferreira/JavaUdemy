package exerciciosVetores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PHospDesafio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados: ");
        int quartos = ent.nextInt();

        Hospedagem[] hosp = new Hospedagem[quartos];

        ent.nextLine();
        for (int i = 0; i < quartos; i++) {
            System.out.println("Hospedagem " + (i + 1) + ": ");
            System.out.print("Nome: ");
            String nome = ent.nextLine();
            System.out.print("Email: ");
            String email = ent.nextLine();
            System.out.print("Número do quarto: ");
            int quarto = ent.nextInt();
            ent.nextLine();

            System.out.println();
            hosp[i] = new Hospedagem(nome, email, quarto);

            if(hosp[i].getQuarto() == quarto) {
                hosp[i].setQuarto(quarto);
            }

        }

        System.out.println("Quartos alugados, e por quem: ");
        for (int i = 0; i < quartos; i++) {
            Arrays.sort(hosp, Comparator.comparing(Hospedagem::getQuarto));
            System.out.print(hosp[i].getQuarto() + ": ");
            System.out.print(hosp[i].getNome() + ", ");
            System.out.println(hosp[i].getEmail());


        }


    }
}
