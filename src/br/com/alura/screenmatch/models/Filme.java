package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return retornaMedia() / 2;
    }

    @Override
    public String toString() {
        return "filme: " + this.getName() + "(" + this.getAnoDeLancamento() + ")";
    }
}
