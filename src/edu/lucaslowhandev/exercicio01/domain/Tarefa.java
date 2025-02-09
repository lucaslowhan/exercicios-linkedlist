package edu.lucaslowhandev.exercicio01.domain;

public class Tarefa {
    private String descricao;
    private boolean realizada;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.realizada = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada() {
        this.realizada = true;
    }

    @Override
    public String toString() {
        return "[ " + (this.realizada ? "✔" : "✘") + " ]" + descricao;
    }
}
