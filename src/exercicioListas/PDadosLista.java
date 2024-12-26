package exercicioListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PDadosLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<DadosLista> listaDados = new ArrayList<>();
        System.out.print("Quantos pessoas serão registradas: ");
        int registros = sc.nextInt();
        System.out.println();

        for (int i = 0; i < registros; i++) {
            System.out.println("Funcionário " + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.println();

            listaDados.add(new DadosLista(id, nome, salario));
        }

        System.out.print("Entre com o id que terá um acréscimo no salário: ");
        int id2 = sc.nextInt();

        double alteracaoSal = 0;
        double porcentagem = 0;

        for (DadosLista dado : listaDados) {
            if (dado.getId() == id2) {
                System.out.println("Entre com a porcentagem: ");
                porcentagem = sc.nextDouble();
                porcentagem = porcentagem / 100;

                alteracaoSal = dado.getSalario() + (dado.getSalario() * porcentagem);
                dado.setSalario(alteracaoSal);

            }else{
                System.out.println("Id não existe!");
                System.out.println();
                for (DadosLista dadoF : listaDados){
                    System.out.println(dadoF.toString());
                }
                return;
            }
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (DadosLista dado : listaDados) {
            System.out.println(dado.toString());
        }

    }

}
