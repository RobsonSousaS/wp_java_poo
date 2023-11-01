/*
Detecção de colisão é uma das operações mais comuns (e importantes) em jogos eletrônicos. O
objetivo, basicamente, é verificar se dois objetos quaisquer colidiram, ou seja, se a interseção entre eles
é diferente de vazio. Isso pode ser usado para saber se duas naves colidiram, se um monstro bateu
numa parede, se um personagem pegou um item, etc.
Para facilitar as coisas, muitas vezes os objetos são aproximados por figuras geométricas simples
(esferas, paralelepípedos, triângulos etc). Neste problema, os objetos são aproximados por retângulos
num plano.
Um retângulo é definido pelas coordenadas de dois pontos no plano: o canto inferior esquerdo
tem coordenadas (x0
,y0
) e o canto superior direito tem coordenadas (x1
,y1
), como mostra a figura abaixo.

Escreva um programa que, dados dois retângulos, determine se eles se interceptam ou não.
 */

package LESSON_01.exercise;

import java.util.Scanner;

public class main_task_06 {
    public static void main(String[] args) {
        int retangulo1x0, retangulo1x1, retangulo1y0, retangulo1y1;
        int retangulo2x0, retangulo2x1, retangulo2y0, retangulo2y1;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite as coordenadas do primeiro retangulo: ");
            System.out.println("x0: ");
            retangulo1x0 = entrada.nextInt();
            System.out.println("y0: ");
            retangulo1y0 = entrada.nextInt();
            System.out.println("x1: ");
            retangulo1x1 = entrada.nextInt();
            System.out.println("y1: ");
            retangulo1y1 = entrada.nextInt();

            System.out.println("Digite as coordenadas do segundo retangulo: ");
            System.out.println("x0: ");
            retangulo2x0 = entrada.nextInt();
            System.out.println("y0: ");
            retangulo2y0 = entrada.nextInt();
            System.out.println("x1: ");
            retangulo2x1 = entrada.nextInt();
            System.out.println("y1: ");
            retangulo2y1 = entrada.nextInt();
        }

        if (retangulo1x0 > retangulo1x1 || retangulo1y0 > retangulo1y1 || retangulo2x0 > retangulo2x1
                || retangulo2y0 > retangulo2y1) {
            System.out.println("Digite as coordenadas corretamente: ");
            System.exit(0);
        }
        if (retangulo1x0 > retangulo2x1 || retangulo1x1 < retangulo2x0 || retangulo1y0 > retangulo2y1
                || retangulo1y1 < retangulo2y0) {
            System.out.println("Boooh! Boooh! Boooh! Boooh! Boooh! Boooh! Boooh!");
            System.out.println("Os retangulos nao se interceptam.");
        } else {
            System.out.println("Sigamos em frete!");
            System.out.println("Os retangulos se interceptam.");
        }

    }

}
