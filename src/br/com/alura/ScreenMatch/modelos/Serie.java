package br.com.alura.ScreenMatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private int episodio;
    private int minutosPorEpisodio;
    private boolean ativa;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporada() {
        return temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodio * minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
