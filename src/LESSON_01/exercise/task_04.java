package LESSON_01.exercise;

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        try (Scanner enter = new Scanner(System.in)) {
            int D, pontuacao;
            System.out.println("Digite a posição do robô: ");
            D = enter.nextInt();
            if (D <= 800) {
                pontuacao = 1;
                System.out.println("Pontuação: " + pontuacao);
            } else if (D > 800 && D <= 1400) {
                pontuacao = 2;
                System.out.println("Pontuação: " + pontuacao);
            } else if (D > 1400 && D <= 2000) {
                pontuacao = 3;
                System.out.println("Pontuação: " + pontuacao);
            } else {

            }
        }
    }
}
