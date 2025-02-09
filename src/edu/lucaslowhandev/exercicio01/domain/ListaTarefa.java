package edu.lucaslowhandev.exercicio01.domain;

import java.util.LinkedList;

public class ListaTarefa {
    private LinkedList<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new LinkedList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa Adicionada com sucesso.");
    }

    public void concluirTarefa(int index){
        if(index>=0 && index < tarefas.size()){
            tarefas.get(index).setRealizada();
        }else {
            System.out.println("Indice invalido!");
        }
    }

    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Lista esta vazia.");
        }else {
            System.out.println("LISTA DE TAREFAS\n");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + tarefas.get(i).toString());
            }
        }
    }

    public void listarPendentes(){
        if(tarefas.isEmpty()){
            System.out.println("LISTA VAZIA");
        }else {
            System.out.println("LISTA DE TAREFAS PENDENTES:\n");
            for (int i = 0; i < tarefas.size(); i++) {
                if (!tarefas.get(i).isRealizada()) {
                    System.out.println(tarefas.get(i).toString());
                }
            }
        }
    }

    public void pesquisarPorDescricao(String descricao){
        if(tarefas.contains(descricao)){
            System.out.println("A tarefa " + descricao + " está na lista.");
        }else {
            System.out.println("Não encontrada.");
        }
    }

    public void remover(int index){
        if(index>=0 && index < tarefas.size()){
            tarefas.remove(index-1);
            System.out.println("Tarefa removida.");
        }else {
            System.out.println("Indice invalido.");
        }
    }

}
