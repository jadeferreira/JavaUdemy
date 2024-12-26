package exercicioMatriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas linhas sua matriz terá: ");
        int lin = sc.nextInt();
        System.out.println("Digite quantas colunas sua matriz terá: ");
        int col = sc.nextInt();

        int[][] mat = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Linha: " + i + ", Coluna: " + j);
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nMatriz: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Qual número deseja visualizar: ");
        int num = sc.nextInt();
        System.out.println();

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == num) {
                        System.out.println("Posição: [" + i + ", " + j + "]");
                        if (j > 0){
                            System.out.println("Número a esquerda: " + mat[i][j - 1]);
                        }
                        if(j < col - 1){
                            System.out.println("Número a direita: " + mat[i][j + 1]);
                        }
                        if (i > 0){
                            System.out.println("Número a cima: " + mat[i -1][j]);
                        }
                        if(i < lin - 1){
                            System.out.println("Número a baixo: " + mat[i + 1][j]);
                        }
                }
            }
            System.out.println();
        }


    }
}
