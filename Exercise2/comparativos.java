package Exercise2;
import java.util.Scanner;

public class comparativos {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um numero inteiro: ");
    int numero1 = leitor.nextInt();
    System.out.println("Digite outro numero inteiro: ");
    int numero2 = leitor.nextInt();

    if (numero1 == numero2) {
        System.out.println(String.format("Os numeros %d e %d são iguais.", numero1, numero2));
    } else if (numero1 > numero2) {
        System.out.println(String.format("O numero %d é maior que o numero %d.", numero1, numero2));
    } else if (numero1 < numero2) {
        System.out.println(String.format("O numero %d é menor que o numero %d.", numero1, numero2));
    } else {
        System.out.println(String.format("Os numeros %d e %d são diferentes.", numero1, numero2));
    }
    }
}

