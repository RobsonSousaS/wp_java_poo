/*
O professor George está implementando o sistema de controle de pagamentos parcelados de
uma grande empresa de cartão de crédito digital. Os clientes podem parcelar as compras sem juros no
cartão, em até 18 vezes.
Quando o valor da compra é divisível pelo número de parcelas que o cliente escolhe, todas as
parcelas terão o mesmo valor. Por exemplo, se o cliente comprar um livro de 30 reais em 6 vezes, então
as parcelas terão valores: 5, 5, 5, 5, 5 e 5.
Se o valor da compra não for divisível pelo número de parcelas será preciso fazer um ajuste, pois
a empresa quer que todas as parcelas tenham sempre um valor inteiro e somem no total, claro, o valor
exato da compra. O que professor George decidiu foi distribuir o resto da divisão de valor da compra
pelo número de parcelas igualmente entre as parcelas iniciais. Por exemplo, se a compra for de 45 reais
e o número de parcelas for 7, então as parcelas terão valores: 7, 7, 7, 6, 6, 6 e 6.
Escreva um programa que, dado o valor da compra e o número de parcelas, imprima os valores
de cada parcela.
 */

package LESSON_01.exercise;

import java.util.Scanner;

public class main_task_02 {
    public static void main(String[] args) {
        try (Scanner enter = new Scanner(System.in)) {
            int val, qntdeparcelas;
            System.out.println("Digite o valor:");
            val = enter.nextInt();
            System.out.println("Digite a quantidade de parcelas:");
            qntdeparcelas = enter.nextInt();
            if (qntdeparcelas <= 18 && qntdeparcelas >= 1) {
                int rest = val % qntdeparcelas;
                int cont = 1;
                if (rest == 0) {
                    while (cont < qntdeparcelas) {
                        int parcela = val / qntdeparcelas;
                        System.out.println(parcela);
                        cont++;
                    }
                } else {
                    while (cont <= qntdeparcelas) {
                        int parcela = val / qntdeparcelas;
                        if (cont > rest) {
                            System.out.println(parcela);
                        } else {
                            System.out.println(parcela + rest / rest);
                        }
                        cont++;
                    }
                }
            }
        }

    }

}
