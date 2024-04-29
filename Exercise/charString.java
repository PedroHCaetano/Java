package Exercise;

public class charString {
    public static void main(String[] args) {
        char letra = 'A';  // char só usa ''
        String palavra = " torneira";
        String mensagem = letra + palavra;

        System.out.println(String.format(mensagem));
    }
}
