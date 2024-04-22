package Exercice;

public class calculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 139.90;
        double percentualDesconto = 10.0;
        double valorDesconto =  (percentualDesconto / 100) * precoOriginal;
        double precoAtualizado = precoOriginal - valorDesconto;
        System.out.println(String.format("O novo valor é: R$%.2f", precoAtualizado));
    }
}
