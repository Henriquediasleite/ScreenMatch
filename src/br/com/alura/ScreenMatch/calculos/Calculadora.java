package br.com.alura.ScreenMatch.calculos;

import br.com.alura.ScreenMatch.modelos.Titulo;

public class Calculadora {
    private int tempoTotal = 0;

    // Retorna o tempo total acumulado
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    /*
     * Os métodos abaixo foram comentados, pois o método genérico acima substitui a necessidade deles.
     * Se quiser usar métodos específicos para Filme e Série, basta descomentar:
     */

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
}