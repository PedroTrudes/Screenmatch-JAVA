package br.com.alura.screenmatch.models;
//temos que colocar o public para poder usar os atributos e metodos em outra pasta -- não é muito usado
    public class Filme {
        private String nome;
        private String descricaoDoFilme;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes; //não permite ler e nem escrever em outra classe
        private String tempoDeDuracao;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricaoDoFilme() {
            return descricaoDoFilme;
        }

        public void setDescricaoDoFilme(String descricaoDoFilme) {
            this.descricaoDoFilme = descricaoDoFilme;
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

        public String getTempoDeDuracao() {
            return tempoDeDuracao;
        }

        public void setTempoDeDuracao(String tempoDeDuracao) {
            this.tempoDeDuracao = tempoDeDuracao;
        }

        //Metodos da classe filme
            public void exibeFichaTecnica(){
                System.out.println("Nome do Filme: "+ getNome().toUpperCase());
                System.out.println("Descricao do Filme: " + getDescricaoDoFilme());
                System.out.println("Ano do Filme: " + getAnoDeLancamento());
                System.out.println("Tempo de filme: " + getTempoDeDuracao());
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
//Usamos para criar modelos de dados que queremos na nossa aplicacao
