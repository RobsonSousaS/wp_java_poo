
/*
Uma companhia de teatro deseja montar uma série de espetáculos. A direção calcula que, a R$5,00 o
ingresso, serão vendidos 120 ingressos, e que as despesas serão de R$200,00. Diminuindo-se em R$0,50
o preço dos ingressos, espera-se que as vendas aumentem em 26 ingressos. Faça um programa que
escreva uma tabela de valores de lucros esperados em função do preço do ingresso, fazendo-se várias
esse preço de R$5,00 a R$1,00, de R$0,50 em R$0,50. Escreva, ainda, para cada novo preço de ingresso, o
lucro esperado, o preço do ingresso e a quantidade de ingressos vendidos para obtenção desse lucro.
 */
package LESSON_02.exercise;

import java.util.Scanner;

public class main_task_01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        }

        double precoIngresso = 5.00;
        double lucroEsperado = (precoIngresso - 2.50) * (120 + 26) - 200;
        int ingressosVendidos = 120 + 26;

        while (precoIngresso >= 1.00) {
            lucroEsperado = (precoIngresso - 2.50) * (120 + 26) - 200;
            ingressosVendidos = 120 + 26;

            System.out.println("Preço do ingresso: R$" + precoIngresso);
            System.out.println("Lucro esperado: R$" + lucroEsperado);
            System.out.println("Ingressos vendidos: " + ingressosVendidos);
            System.out.println();

            precoIngresso -= 0.50;
        }
    }
}