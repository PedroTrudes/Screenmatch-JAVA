import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Top Gun - maverick");
        filme.setDescricaoDoFilme("Enredo. Mais de 30 anos após se formar na Top Gun, o Capitão da Marinha dos Estados Unidos, Pete Mitchell, se tornou um ousado piloto de testes. Apesar de muitas conquistas, ele se recusa a subir de patente devido á sua");

        filme.setAnoDeLancamento(2022);
        filme.setIncluidoNoPlano(false);

        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        filme.setTempoDeDuracao(180);
        System.out.println("Ficha tecnica do filme: ");
        filme.exibeFichaTecnica();
        System.out.println("*************************************");
        System.out.println("Nota do filme: " + filme.pegaMedia());
        System.out.println("Numero Total de avaliacoes: " + filme.getTotalDeAvaliacoes());
        //encapsulamento não permitir que seja alterado os atributos sem ser por metodos
        Filme filme02 = new Filme();
        filme02.setTempoDeDuracao(20);
        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2002);
        lost.setTemporada(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duracao para maratonar lost: " + lost.getTempoDeDuracao());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme);
        calculadoraDeTempo.inclui(filme02);
        calculadoraDeTempo.inclui(lost);
        System.out.println("Tempo total do filme: "+calculadoraDeTempo.getTempoTotal());

    }
}