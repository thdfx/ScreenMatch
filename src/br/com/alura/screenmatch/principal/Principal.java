package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Filme novoFilme = new Filme("Homem de ferro", 2005);
        novoFilme.setDuracaoEmMinutos(180);
        novoFilme.setIncluidoNoPlano(true);
        for (int i = 0; i < 10; i++) {
            novoFilme.avalia(8);
        }
        novoFilme.exibirFicha();
        novoFilme.getClassificacao();


        Filme filme1 = new Filme("Transfomers: O ultimo cavaleiro", 2008);
        filme1.setDuracaoEmMinutos(220);
        filme1.setIncluidoNoPlano(true);
        filme1.avalia(10);
        filme1.avalia(5);
        filme1.avalia(3);
        filme1.exibirFicha();

        Serie serie1 = new Serie("Outer Banks", 2010);
        serie1.setTemporadas(10);
        serie1.setEpsodiosPorTemporada(10);
        serie1.setTempoPorEpsodios(55);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(novoFilme);
        calculadora.inclui(filme1);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filme1);
        filtro.filtrar(novoFilme);

        Episodio epsodio1 = new Episodio();
        epsodio1.setNumero(1);
        epsodio1.setSerie(serie1);
        epsodio1.setTotalVisualizacoes(350);
        filtro.filtrar(epsodio1);


        Filme filme2 = new Filme("Superman", 2000);
        filme2.setDuracaoEmMinutos(250);
        filme2.setDiretor("DC");

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(filme2);
        ListaDeFilmes.add(filme1);
        ListaDeFilmes.add(novoFilme);
        System.out.println(ListaDeFilmes.size() + " Filmes");
        System.out.println(ListaDeFilmes.get(1).getName());
        System.out.println(ListaDeFilmes.getFirst().getName());
        System.out.println(ListaDeFilmes.get(0).toString());
        System.out.println(ListaDeFilmes);




    }
}
