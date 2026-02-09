package br.com.alura.screenmatch.models;

public class Serie extends Titulo{
    private int temporadas;
    private int tempoPorEpsodios;
    private boolean serieAtiva;
    private int epsodiosPorTemporada;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTempoPorEpsodios() {
        return tempoPorEpsodios;
    }

    public void setTempoPorEpsodios(int tempoPorEpsodios) {
        this.tempoPorEpsodios = tempoPorEpsodios;
    }

    public boolean isSerieAtiva() {
        return serieAtiva;
    }

    public void setSerieAtiva(boolean serieAtiva) {
        this.serieAtiva = serieAtiva;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return epsodiosPorTemporada * temporadas * tempoPorEpsodios;
    }
}
