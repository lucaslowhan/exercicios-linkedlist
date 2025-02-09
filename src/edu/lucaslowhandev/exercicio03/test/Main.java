package edu.lucaslowhandev.exercicio03.test;

import edu.lucaslowhandev.exercicio03.domain.HistoricoNavegacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("-- LOWHAN CHROME --");
            System.out.println("(1)ACESSAR SITE  --");
            System.out.println("(2)RETORNAR SITE --");
            System.out.println("(3)HISTORICO     --");
            System.out.println("(0)SAIR          --");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1 :
                    String url = sc.nextLine();
                    historico.acessarNovoSite(url);
                    break;
                case 2 :
                    historico.voltarSiteAnterior();
                    break;
                case 3 :
                    historico.exibirHistorico();
                    break;
                case 0 :
                    return;
                default :
                    System.out.println("OPÇÃO INCORRETA");
            }
        }
    }
}
