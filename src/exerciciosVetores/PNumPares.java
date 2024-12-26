package exerciciosVetores;

import java.util.Scanner;

public class PNumPares {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int num = ent.nextInt();

        int numPares = 0;

        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Digite um número: ");
            nums[i] = ent.nextInt();

            if(nums[i] % 2 == 0){
                numPares++;
            }
        }

        System.out.println("Números pares: ");
        for (int i = 0; i < num; i++) {
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }

        System.out.println("Quantidade de números pares: " + numPares);
    }
}
