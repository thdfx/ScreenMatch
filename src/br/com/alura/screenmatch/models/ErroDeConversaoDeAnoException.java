package br.com.alura.screenmatch.models;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    public String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }
}
