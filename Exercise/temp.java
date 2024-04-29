// Converta uma temperatura em graus Celsius para Fahrenheit.
package Exercise;

public class temp {
    public static void main(String[] args) {

    double grauCelsius = 28;
    double grauFahrenheit = (grauCelsius * 1.8) + 32;

    String mensagem = String.format("A temperatura %.2f em grau Celsius é equivalente a %.2fº grau Fahrenheit.", grauCelsius, grauFahrenheit);

    System.out.println(mensagem);

    int grauFahrenheitInteiro = (int) grauFahrenheit;
    System.out.println(String.format("a temperatura inteira em grau Fahrenheit é igual a %dº", grauFahrenheitInteiro));
}
}