/*
 * 
 */

package LESSON_01.exercise;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        try (Scanner enter = new Scanner(System.in)) {
            int val, qntdeparcelas;
            System.out.println("Digite o valor:");
            val = enter.nextInt();
            System.out.println("Digite a quantidade de parcelas:");
            qntdeparcelas = enter.nextInt();
            if (qntdeparcelas <= 18 && qntdeparcelas >= 1) {
                int resto = val % qntdeparcelas;
                int cont = 1;
                if (resto == 0) {
                    while (cont < qntdeparcelas) {
                        int parcela = val / qntdeparcelas;
                        System.out.println(parcela);
                        cont++;
                    }
                } else {
                    while (cont <= qntdeparcelas) {
                        int parcela = val / qntdeparcelas;
                        if (cont > resto) {
                            System.out.println(parcela);
                        } else {
                            System.out.println(parcela + resto / resto);
                        }
                        cont++;
                    }
                }
            }
        }

    }

}