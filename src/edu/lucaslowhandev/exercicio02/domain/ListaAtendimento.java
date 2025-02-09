package edu.lucaslowhandev.exercicio02.domain;

import java.util.LinkedList;

public class ListaAtendimento {
    private LinkedList<Pessoa> listaAtendimento;

    public ListaAtendimento() {
        this.listaAtendimento = new LinkedList<>();
    }

    //Adicionar cliente a fila
    public void adicionarCliente(String nome){
        listaAtendimento.add(new Pessoa(nome));
    }

    //Atender cliente da vez
    public void atenderCliente(){
        if (!listaAtendimento.isEmpty()) {
            System.out.println(listaAtendimento.poll().getNome() + " atendido!");
            if(!listaAtendimento.isEmpty()) {
                System.out.println("Proximo da fila: " + listaAtendimento.peek().getNome());
            }
        }else {
            System.out.println("Fila vazia!");
        }
    }

    public void exibirFila(){
        if(!listaAtendimento.isEmpty()) {
            System.out.println("FILA DE ATENDIMENTO");
            for (int i = 0; i < listaAtendimento.size(); i++) {
                System.out.println((i + 1) + " " + listaAtendimento.get(i).getNome());
            }
        }else {
            System.out.println("Sem filas no momento!");
        }
    }
    public void listaVazia(){
        if(listaAtendimento.isEmpty()){
            System.out.println("Fila vazia");
        }else{
            System.out.println("Temos clientes na fila \n");
            this.exibirFila();
        }
    }


}
