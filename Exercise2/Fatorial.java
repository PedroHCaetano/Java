package Exercise2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner fator = new Scanner(System.in);

        System.out.println("Escolhe um numero inteiro para fatorar: ");
        int numero = fator.nextInt();
        long fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial = fatorial * i;
            i++;

        } System.out.println(String.format("O fatorial de %d é: %d", numero, fatorial));
    }
}
