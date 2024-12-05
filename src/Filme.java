public class Filme {
    String nome;
    String descricaoDoFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int tempoDeDuracao;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: "+ this.nome);
        System.out.println("Descricao do Filme: " + this.descricaoDoFilme);
        System.out.println("Ano do Filme: " + this.anoDeLancamento);
        System.out.println(this.incluidoNoPlano);
        System.out.println(this.somaDasAvaliacoes);
        System.out.println(this.totalDeAvaliacoes);
        System.out.println(this.tempoDeDuracao);
    }

    //metodos que não retorna nada usamos VOID
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //Aqui estamos retornando algo perceba a diferenca
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
//Usamos para criar modelos de dados que queremos na nossa aplicacao