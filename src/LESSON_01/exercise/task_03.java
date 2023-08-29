/*
Um fugitivo, um helicóptero e um policial estão em posições distintas numa pista circular,
exatamente como a mostrada na figura ao lado, com dezesseis posições numeradas de 0 a 15 em
direção anti-horária. O helicóptero e o policial ficam sempre parados. O objetivo do fugitivo é chegar no
helicóptero sem passar pelo policial antes, claro. Ele pode decidir correr na direção horária, ou na
direção anti-horária. Neste problema, dadas as posições do helicóptero, do policial e do fugitivo, e a
direção em que o fugitivo decide correr, seu programa deve dizer se ele vai
ou não conseguir fugir! Na figura, se o fugitivo decidir correr na direção
horária, ele consegue fugir; se decidir correr na direção anti-horária, ele vai
ser preso antes de chegar no helicóptero!
A entrada consiste de quatro inteiros: H, P, F e D, representando,
respectivamente, as posições do helicóptero, do policial e do fugitivo, e a
direção em que o fugitivo corre, -1 para horário e 1 para anti-horário.
Seu programa deve imprimir uma linha contendo o caractere "S" se o
fugitivo consegue fugir, ou "N" caso contrário.
 */

package LESSON_01.exercise;

import java.util.Scanner;

public class task_03 {

    public static void main(String[] args) {
        try (Scanner enter = new Scanner(System.in)) {
            int H, P, F, D;
            int count = 0;
            int limit = 15;
            System.out.println("Digite a posição do helicóptero:(0 - 15)");
            H = enter.nextInt();
            if (H >= count && H <= limit) {
                System.out.println("Digite a posição do policial:(0 - 15)");
                P = enter.nextInt();
                if (P >= count && P <= limit) {
                    System.out.println("Digite a posição do fugitivo:(0 - 15)");
                    F = enter.nextInt();
                    if (F >= count && F <= limit) {
                        System.out.println("Digite a direção: -1 => Para horária ou 1 => Para anti-horário;");
                        D = enter.nextInt();
                        if (D == -1 || D == 1) {
                            if (D == -1) {
                                if (P < F) {
                                    System.out.println("N");
                                } else {
                                    System.out.println("S");
                                }
                            } else {
                                if (P > F) {
                                    System.out.println("N");
                                } else {
                                    System.out.println("S");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
