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