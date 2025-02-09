package edu.lucaslowhandev.exercicio05.test;

import edu.lucaslowhandev.exercicio05.domain.NumerosInteiros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumerosInteiros numerosInteiros = new NumerosInteiros();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("      NUMEROS INTEIROS ");
            System.out.println("(1) ADICIONAR NUMERO INTEIRO ");
            System.out.println("(2) REMOVER NUMEROS PARES ");
            System.out.println("(3) REMOVER NUMEROS IMPARES ");
            System.out.println("(4) INVERTER NUMEROS ");
            System.out.println("(5) LISTAR NUMEROS ");
            System.out.println("(0) SAIR ");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    int numero = sc.nextInt();
                    numerosInteiros.adicionarNumero(numero);
                    break;
                case 2:
                    numerosInteiros.removerNumerosPares();
                    break;
                case 3:
                    numerosInteiros.removerNumerosImpares();
                    break;
                case 4:
                    numerosInteiros.inverterLista();
                    break;
                case 5:
                    numerosInteiros.listarNumeros();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção incorreta.");
            }
        }
    }
}
