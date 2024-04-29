package Adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int numeroSecreto = new Random().nextInt(100);
    int totalTentativas = 0;
    int chute = 0;

    while (totalTentativas < 5) {
        System.out.println("Digite um numero de 0 a 100: ");
        chute = leitor.nextInt();
        totalTentativas++;

        if (chute == numeroSecreto) {
            System.out.println("Parabéns! Você acertou o numero secreto.");
            break;
        } else if (chute < numeroSecreto) {
            System.out.println(String.format("O numero secreto é maior que %d", chute));
        } else {
            System.out.println(String.format("O numero secreto é menor que %d", chute));
        }
    }

    if (totalTentativas == 5 && chute != numeroSecreto) {
        System.out.println("Você perdeu.");
    }
    }
}
