package edu.lucaslowhandev.exercicio05.domain;

import java.util.Collections;
import java.util.LinkedList;

public class NumerosInteiros {
    private LinkedList<Integer> numerosInteiros;

    public NumerosInteiros() {
        this.numerosInteiros = new LinkedList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
        System.out.println(numero + " adicionado a lista.");
    }

    public void removerNumerosPares(){
        if(!numerosInteiros.isEmpty()){
            for (int i = 0; i < numerosInteiros.size(); i++) {
                if(numerosInteiros.get(i) % 2 == 0){
                    numerosInteiros.remove(i);
                    i--;
                }
            }
        }else{
            System.out.println("Lista vazia.");
        }
    }

    public void removerNumerosImpares(){
        if(!numerosInteiros.isEmpty()) {
            for (int i = 0; i < numerosInteiros.size(); i++) {
                if (numerosInteiros.get(i) % 2 != 0) {
                    numerosInteiros.remove(i);
                    i--;
                }
            }
        }else{
            System.out.println("Lista vazia.");
        }
    }

    public void inverterLista(){
        if(!numerosInteiros.isEmpty()) {
            Collections.reverse(numerosInteiros);
            System.out.println("Numeros invertidos: ");
            for (int i = 0; i < numerosInteiros.size(); i++) {
                System.out.println(numerosInteiros.get(i));
            }
        }else {
            System.out.println("Lista vazia.");
        }
    }

    public void listarNumeros(){
        if(!numerosInteiros.isEmpty()){
            for (int i = 0; i < numerosInteiros.size(); i++) {
                System.out.println(numerosInteiros.get(i));
            }
        }
    }
}
