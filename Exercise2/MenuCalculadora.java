package Exercise2;
import java.util.Scanner;
public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("1. Calcular Área do Quadrado");
            System.out.println("2. Calcular Área do Circulo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = menu.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = menu.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println(String.format("A área do quadrado é: %.2f", areaQuadrado));

            } else if (escolha == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raio = menu.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println(String.format("A área do círculo é: %.2f", areaCirculo));

            } else if (escolha == 3) {
                System.out.println("Você saiu do menu.");

            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }
    }
}
