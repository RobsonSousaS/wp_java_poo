/*
Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que
receba o código e o valor de quinze transações, calcule e mostre:
a) O valor total das compras à vista
b) O valor total das compras a prazo
c) O valor total das compras efetuadas
d) O valor da primeira prestação das compras a prazo juntas, sabendo-se que serão pagas em 3
vezes.
 */

package LESSON_02.exercise;

import java.util.Scanner;

class main_task_02 {

    public static void main(String[] args) {
        char codigo;
        float valor;
        float totalCompras = 0;
        float totalaVista = 0;
        float totalTransacaoaPrazo = 0;
        int contador;

        try (Scanner enter = new Scanner(System.in)) {
            for (contador = 0; contador < 15; contador++) {
                System.out.println("Digite o codigo do produto (V para à vista, P para a prazo):");
                codigo = enter.nextLine().charAt(0);

                if (codigo == 'p' || codigo == 'P') {
                    System.out.print("\nValor da Compra: ");
                    valor = enter.nextFloat();
                    totalTransacaoaPrazo += valor;
                } else if (codigo == 'v' || codigo == 'V') {
                    System.out.print("\nValor da Compra: ");
                    valor = enter.nextFloat();
                    totalaVista += valor;
                } else {
                    System.out.println("Codigo invalido!");
                    break;
                }
                enter.nextLine();

                totalCompras = totalaVista + totalTransacaoaPrazo;
            }
        }

        System.out.println("\nTotal de compras à vista: " + totalaVista);
        System.out.println("Total de compras a prazo: " + totalTransacaoaPrazo);
        System.out.println("Valor total das compras efetuadas: " + totalCompras);

        if (totalTransacaoaPrazo > 0) {
            double primeiraPrestacao = totalTransacaoaPrazo / 3;
            System.out.println("Valor da primeira prestação das compras a prazo: " + primeiraPrestacao);
        }
    }
}