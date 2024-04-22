public class Main {   // Criei um classe publica e ela deve ter o msm nome do arquivo

    public static void main(String[] args) {
        System.out.println("Esse é o Stanox");
        String nome = "Top Gun: Maverick";
        System.out.println(nome);

        int anoDeLancamento = 2022;
        System.out.println(String.format("Ano de Lançamento: %d", anoDeLancamento));
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1; // double é similar ao float

        double media = (6.3 + 8.0 + 7.7) / 3;
        System.out.println(media);
        String sinopse;

        sinopse = """
                Sequência do filme de sucesso dos anos 80, %s, estrelado por Tom Cruise.
                Data de lançamento: %d
                """.formatted(nome, anoDeLancamento);

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}