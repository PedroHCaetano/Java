package Exercise;

public class dolarForReais {
    public static void main(String[] args) {
    double valorEmDolares = 25;
    double reais = 4.94;
    double conversao = (valorEmDolares * reais);
    System.out.println(String.format("A conversao do valor em dolar para real é: R$%.2f", conversao));
    }
}
