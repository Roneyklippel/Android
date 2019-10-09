package br.com.senac.projetoreferencia.model;

import androidx.annotation.NonNull;

public class Mensagem {

    private Long id;

    private String texto;

    private Status status;

    public Mensagem(Long id, String texto, Status status) {
        this.id = id;
        this.texto = texto;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}