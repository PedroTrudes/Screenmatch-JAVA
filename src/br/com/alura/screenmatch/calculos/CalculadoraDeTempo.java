package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    //Só geramos o get pq não faz sentido eu colocar um valor sendo que ele vai pegar de uma outra classe
    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal = tempoTotal + titulo.getTempoDeDuracao();
    }

//    public void incluirNaLista(Filme f) {
//        tempoTotal = tempoTotal + f.getDuracaoFilme();
//    }
//    //Sobrecarga de metodo
//    public void incluirNaLista(Serie s) {
//        tempoTotal = tempoTotal + s.getTempoDeDuracao();
//    }
}
