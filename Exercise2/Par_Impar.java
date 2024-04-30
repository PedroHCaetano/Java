package Exercise2;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner analise = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = analise.nextInt();

        if (numero % 2 == 0) {
            System.out.println(String.format("O numero %d é par.", numero));
        } else {
            System.out.println(String.format("O numero %d é impar.", numero));
        }
    }
}
