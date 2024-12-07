import br.com.alura.screenmatch.models.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();//Usamos sempre para criar um filme novo --  tipo referencia a classe Filme
        filme.setNome("Top Gun - maverick");
        filme.setDescricaoDoFilme("Enredo. Mais de 30 anos após se formar na Top Gun, o Capitão da Marinha dos Estados Unidos, Pete Mitchell, se tornou um ousado piloto de testes. Apesar de muitas conquistas, ele se recusa a subir de patente devido á sua");

        filme.setAnoDeLancamento(2022);
        filme.setTempoDeDuracao("2:55:00H");
        filme.setIncluidoNoPlano(false);

        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println("Ficha tecnica do filme: ");
        filme.exibeFichaTecnica();
        System.out.println("*************************************");
        System.out.println("Nota do filme: " + filme.pegaMedia());
        System.out.println("Numero Total de avaliacoes: " + filme.getTotalDeAvaliacoes());
        //encapsulamento não permitir que seja alterado os atributos sem ser por metodos
    }
}