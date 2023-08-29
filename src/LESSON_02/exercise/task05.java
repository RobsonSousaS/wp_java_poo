/*
Faça um programa que receba o salário de uma funcionária chamado Maria. Sabe-se que outro
funcionário, João, tem salário equivalente a um terço do salário de Maria. Maria aplicará seu salário
integralmente na caderneta de poupança que rende 1% ao mês e João aplicará seu salário integralmente
no fundo de renda fixa, que rende 3% ao mês. Faça um programa que calcula e mostra a quantidade de
meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Maria.
 */

package LESSON_02.exercise;

import java.util.Scanner;

public class task05 {
  public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o salário de Maria: ");
            double salarioMaria = scanner.nextDouble();

            double salarioJoao = salarioMaria / 3;

            int meses = 0;

            while (salarioJoao <= salarioMaria) {
                salarioMaria += salarioMaria * 0.01;
                salarioJoao += salarioJoao * 0.03;
                meses++;
            }
            System.out.println("Após " + meses + " meses, o valor de Joao igualará ou ultrapassará o valor de Maria.");
        }
    }
}
