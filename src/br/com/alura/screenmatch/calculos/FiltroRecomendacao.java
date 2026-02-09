package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao{

    public void filtrar(Classificacao classificacao){
        if(classificacao.getClassificacao() >= 4 ){
            System.out.println("O filme esta na lista dos filmes mais vistos mundialmente!");
        }else if(classificacao.getClassificacao() >= 2){
            System.out.println("O filme e muito bom!");
        }else{
            System.out.println("O filme nao é muito bem avaliado!");
        }
    }
}
