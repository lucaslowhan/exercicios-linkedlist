package edu.lucaslowhandev.exercicio01.test;

import edu.lucaslowhandev.exercicio01.domain.ListaTarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTarefa lista = new ListaTarefa();
        while (true) {
            System.out.println("--   LISTA DE TAREFAS   --");
            System.out.println("-- (1) ADICIONAR TAREFA --");
            System.out.println("-- (2) REMOVER TAREFA   --");
            System.out.println("-- (3) CONCLUIR TAREFA  --");
            System.out.println("-- (4) LISTAR TAREFAS   --");
            System.out.println("-- (5) LISTAR PENDENTES --");
            System.out.println("-- (6) PESQUISAR TAREFA --");
            System.out.println("-- (0) SAIR             --");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite a descrição da sua tarefa:");
                    String descricao = sc.nextLine();
                    lista.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.println("Digite o indice da tarefa a ser removida:");
                    int index = sc.nextInt();
                    lista.remover(index);
                    break;
                case 3:
                    System.out.println("Digite o indice da tarefa a ser concluida:");
                    index = sc.nextInt();
                    lista.concluirTarefa(index);
                    break;
                case 4:
                    lista.listarTarefas();
                    break;
                case 5:
                    lista.listarPendentes();
                    break;
                case 6:
                    System.out.println("Digite a descrição que deseja consultar:");
                    descricao = sc.nextLine();
                    lista.pesquisarPorDescricao(descricao);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }

        }
    }
}
