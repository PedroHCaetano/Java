package Exercise2;
import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero positivo ou negativo: ");
        int numero = leitor.nextInt();

        if (numero <= -1) {
            System.out.println(String.format("O numero %d é negativo", numero));
        } else {
            System.out.println(String.format("O numero %d é positivo", numero));
        }

}
}
