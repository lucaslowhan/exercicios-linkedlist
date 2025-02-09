package edu.lucaslowhandev.exercicio02.test;

import edu.lucaslowhandev.exercicio02.domain.ListaAtendimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaAtendimento fila = new ListaAtendimento();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--   FILA DE ATENDIMENTO   --\n");
            System.out.println("-- (1) Adicionar Cliente   --");
            System.out.println("-- (2) Atender Cliente     --");
            System.out.println("-- (3) Exibir Fila         --");
            System.out.println("-- (4) Verificar fila vazia--");
            System.out.println("-- (0) Sair                --");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 :
                    System.out.println("Digite o nome do cliente para adicionar a fila: ");
                    String nome = sc.nextLine();
                    fila.adicionarCliente(nome);
                    break;
                case 2 :
                    fila.atenderCliente();
                    break;
                case 3 :
                    fila.exibirFila();
                    break;
                case 4 :
                    fila.listaVazia();
                    break;
                case 0 :
                    return;
                default :
                    System.out.println("Opção incorreta.");
            }
        }
    }
}
