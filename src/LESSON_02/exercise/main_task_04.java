/*
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código.
Os códigos utilizados são:

1, 2, 3, 4 Votos para os respectivos candidatos
5 Voto nulo
6 Voto em branco

Faça um programa que calcule e mostre:
a) O total de votos para cada candidato
b) O total de votos nulos
c) O total de votos em branco
d) As porcentagens de votos nulos e de votos em brancos sobre o total de votos
e) A porcentagem de votos de cada candidato
Para finalizar o conjunto de votos, tem-se que digitar o valor zero e, para códigos inválidos, deverá
mostrar uma mensagem na tela “CÓDIGO INVÁLIDO”
 */

package LESSON_02.exercise;

import java.util.Scanner;

public class main_task_04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalVotos = 0;
            int[] votosCandidatos = new int[5];
            int votosNulos = 0;
            int votosEmBranco = 0;

            System.out.println("Digite os votos (1 a 4 para candidatos, 5 para voto nulo, 6 para voto em branco):");

            while (true) {
                int voto = scanner.nextInt();

                if (voto == 0) {
                    break;
                } else if (voto >= 1 && voto <= 4) {
                    votosCandidatos[voto]++;
                } else if (voto == 5) {
                    votosNulos++;
                } else if (voto == 6) {
                    votosEmBranco++;
                } else {
                    System.out.println("CODIGO INVALIDO");
                }
                totalVotos++;
            }
            System.out.println("Total de votos para cada candidato:");
            for (int i = 1; i <= 4; i++) {
                System.out.println("Candidato " + i + ": " + votosCandidatos[i] + " votos");
            }

            System.out.println("Total de votos nulos: " + votosNulos + " votos");
            System.out.println("Total de votos em branco: " + votosEmBranco + " votos");

            double porcentagemNulos = (double) votosNulos / totalVotos * 100;
            double porcentagemBrancos = (double) votosEmBranco / totalVotos * 100;

            System.out.println("Porcentagem de votos nulos sobre o total de votos: " + porcentagemNulos + "%");
            System.out.println("Porcentagem de votos em branco sobre o total de votos: " + porcentagemBrancos + "%");

            System.out.println("Porcentagem de votos para cada candidato:");
            for (int i = 1; i <= 4; i++) {
                double porcentagemCandidato = (double) votosCandidatos[i] / totalVotos * 100;
                System.out.println("Candidato " + i + ": " + porcentagemCandidato + "%");
            }
        }
    }
}