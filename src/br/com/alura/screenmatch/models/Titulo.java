package br.com.alura.screenmatch.models;

public class Titulo {
    private String nome;
    private String descricaoDoTitulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes; //não permite ler e nem escrever em outra classe
    private int tempoDeDuracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoDoFilme() {
        return descricaoDoTitulo;
    }

    public void setDescricaoDoFilme(String descricaoDoFilme) {
        this.descricaoDoTitulo = descricaoDoFilme;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    //Metodos da classe filme
    public void exibeFichaTecnica(){
        System.out.println("Nome do titulo: "+ getNome().toUpperCase());
        System.out.println("Descricao do titulo: " + getDescricaoDoFilme());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Tempo de duracao: " + getTempoDeDuracao());
        if(getIncluidoNoPlano() == true){
            System.out.println("Incluso no plano");
        }else{
            System.out.println("Nao esta no plano");
        }
    }

    //metodos que não retorna nada usamos VOID
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //Aqui estamos retornando algo perceba a diferenca
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
