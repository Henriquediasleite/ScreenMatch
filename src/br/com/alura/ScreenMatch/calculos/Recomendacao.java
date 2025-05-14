package br.com.alura.ScreenMatch.calculos;

public class Recomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("estar entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avalidado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
