package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class ListaPrincipal {
    static void main(String[] args) {
        Filme novoFilme = new Filme("Homem de ferro", 2005);
        novoFilme.avalia(9);
        Filme filme1 = new Filme("Transfomers: O ultimo cavaleiro", 2008);
        filme1.avalia(8);
        Serie serie1 = new Serie("Outer Banks", 2010);

        Filme filme2 = new Filme("Superman", 2000);
        filme2.avalia(10);

        ArrayList<Titulo> Lista = new ArrayList<>();
        Lista.add(filme2);
        Lista.add(filme1);
        Lista.add(novoFilme);
        Lista.add(serie1);
        System.out.println(Lista);

        for(Titulo item: Lista){
            System.out.println(item.getName());
            if(item instanceof Filme filme){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }else{
                System.out.println("A serie nao é avaliada");}

        }

        ArrayList<String> buscas = new ArrayList<>();
        buscas.add("Thiago");
        buscas.add("Vitor");
        buscas.add("Roberto");
        System.out.println("Antes da ordenação");
        System.out.println(buscas);
        Collections.sort(buscas);
        System.out.println("Depois da ordenação");
        System.out.println(buscas);

        System.out.println("Antes da ordenação por ordem alfabetica");
        System.out.println(Lista);
        Collections.sort(Lista);
        System.out.println("Depois da ordenação por ordem alfabetica");
        System.out.println(Lista);
        System.out.println("Ordenando por ano de lançamento");
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(Lista);


    }
}
