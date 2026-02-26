package br.com.alura.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvalicoes;
    private int duracaoEmMinutos;



    public Titulo(String nome, int anoLancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoLancamento);
    }

    public String getName() {
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

    public int getTotalAvalicoes(){
        return totalAvalicoes;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFicha(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento do filme: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        if(retornaMedia() > 6){
            System.out.println("A avaliacao do filme e: " + retornaMedia());
            System.out.println("Total de avaliacoes: " + totalAvalicoes);
            System.out.println("A avaliacao do filme e positiva!");
        }else {
            System.out.println("A avaliacao do filme e: " + retornaMedia());
            System.out.println("Total de avaliacoes: " + totalAvalicoes);
            System.out.println("O filme tem uma avaliacao negativa!");
        }
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvalicoes++;

    }

    public int retornaMedia(){

        return (int) (somaDasAvaliacoes / totalAvalicoes);
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento;
    }
}
