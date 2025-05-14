package br.com.alura.ScreenMatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double somaAvaliacoes;
    private boolean incluidoNoPlano;

    // metódos
    public void exibirInformacoes() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento do filme :" + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double obterMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}