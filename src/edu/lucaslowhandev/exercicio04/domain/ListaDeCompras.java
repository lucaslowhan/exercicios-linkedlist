package edu.lucaslowhandev.exercicio04.domain;

import java.util.Collections;
import java.util.LinkedList;

public class ListaDeCompras {
    private LinkedList<String> listaDeCompras;

    public ListaDeCompras() {
        this.listaDeCompras = new LinkedList<>();
    }

    public void adicionarItem(String item){
        listaDeCompras.add(item);
        System.out.println(item + " adicionado na lista.");
    }

    public void removerItemPorNome(String nome){
        if (!listaDeCompras.isEmpty()){
            for (int i = 0; i < listaDeCompras.size(); i++) {
                if(listaDeCompras.get(i).equalsIgnoreCase(nome)){
                    System.out.println("Item removido da lista: " + listaDeCompras.get(i));
                    listaDeCompras.remove(i);
                }
            }
        }else {
            System.out.println("Lista de compras vazia.");
        }
    }

    public void listaPorOrdemAlfabetica(){
        if(!listaDeCompras.isEmpty()){
            Collections.sort(listaDeCompras);
            for (String item : listaDeCompras){
                System.out.println(item);
            }
        }
    }

    public void exibirItensLista(){
        if(!listaDeCompras.isEmpty()){
            for (int i = 0; i < listaDeCompras.size(); i++) {
                System.out.println(listaDeCompras.get(i));
            }
        }
    }
}
