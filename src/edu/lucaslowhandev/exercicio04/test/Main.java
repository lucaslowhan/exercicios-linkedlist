package edu.lucaslowhandev.exercicio04.test;

import edu.lucaslowhandev.exercicio04.domain.ListaDeCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("-- LISTA DE COMPRAS --");
            System.out.println("(1) ADICIONAR ITEM  --");
            System.out.println("(2) REMOVER ITEM    --");
            System.out.println("(3) LISTAR P/ ORDEM --");
            System.out.println("(4) EXIBIR TODOS    --");
            System.out.println("(0) SAIR            --");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Adicione um item.");
                    String item = sc.nextLine();
                    listaDeCompras.adicionarItem(item);
                    break;
                case 2:
                    System.out.println("Digite o item a ser removido:");
                    item = sc.nextLine();
                    listaDeCompras.removerItemPorNome(item);
                    break;
                case 3:
                    listaDeCompras.listaPorOrdemAlfabetica();
                    break;
                case 4:
                    listaDeCompras.exibirItensLista();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("OPÇÃO INCORRETA.");
                    break;
            }
        }
    }
}
