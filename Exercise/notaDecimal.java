package Exercise;

public class notaDecimal {

    public static void main(String[] args) {
        double nota1 = 7.89;
        double nota2 = 3.45;
        double media = (nota1 + nota2) /2;

        System.out.println(String.format("O resultado da média é igual à: %.2f", media));
    }
}
