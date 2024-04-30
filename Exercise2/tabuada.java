package Exercise2;

import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner tabela = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para saber sua tabuada: ");
        int numero = tabela.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(String.format("%d * %d = %d", numero, i, resultado));
        }
            }
    }