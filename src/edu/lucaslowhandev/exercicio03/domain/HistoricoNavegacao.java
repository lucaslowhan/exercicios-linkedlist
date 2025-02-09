package edu.lucaslowhandev.exercicio03.domain;

import java.util.LinkedList;

public class HistoricoNavegacao {
    private LinkedList<String> historico;

    public HistoricoNavegacao() {
        this.historico = new LinkedList<>();
    }

    public void acessarNovoSite(String url){
        historico.push(url);
        System.out.println("Você está acessando: " + url);
    }

    public void voltarSiteAnterior(){
        if(!historico.isEmpty()) {
            if (historico.size()>1) {
                historico.pop();
                System.out.println("Você retornou a página anterior: " + historico.peek());
            }else {
                historico.pop();
                System.out.println("Você voltou a página inicial.");
            }
        }else{
            System.out.println("Você está na pagina inicial.");
        }
    }

    public void exibirHistorico(){
        System.out.println("-- HISTORICO --");
        for (String url : historico){
            System.out.println(url);
        }
    }
}
