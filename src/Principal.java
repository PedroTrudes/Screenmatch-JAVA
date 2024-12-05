public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();//Usamos sempre para criar um filme novo --  tipo referencia a classe Filme
        filme.nome = "Top Gun - maverick";
        filme.descricaoDoFilme = "Enredo. Mais de 30 anos após se formar na Top Gun, o Capitão da Marinha dos Estados Unidos, Pete Mitchell, se tornou um ousado piloto de testes. Apesar de muitas conquistas, ele se recusa a subir de patente devido á sua";
        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println("Teste: " + filme.somaDasAvaliacoes);
        System.out.println("Teste01: " + filme.totalDeAvaliacoes);
        System.out.println(filme.pegaMedia());
    }
}