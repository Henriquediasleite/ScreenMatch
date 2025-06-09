import br.com.alura.ScreenMatch.calculos.Calculadora;
import br.com.alura.ScreenMatch.calculos.Recomendacao;
import br.com.alura.ScreenMatch.modelos.Episodio;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;

import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // Filme 1: O Poderoso Chefão
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirInformacoes();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.obterMedia());

        // Série: Lost
        Serie lost = new Serie("Lost", 2000);
        lost.setTemporada(10);
        lost.setEpisodio(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibirInformacoes();

        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        // Filme 2: Avatar
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos());

        // Calculadora de tempo total
        Calculadora calculadora = new Calculadora();
        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);

        System.out.println("Tempo total para assistir tudo: " + calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoHenrique = new Filme("DogVille", 2003);
        filmeDoHenrique.setDuracaoEmMinutos(200);
        filmeDoHenrique.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoHenrique);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}