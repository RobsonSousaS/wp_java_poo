/*
A organização da OCBR, Olimpíada Canindeense de Basquete de Robô, está começando a ter
problemas com dois times: os Bit Warriors e os Byte Bulls. É que os robôs desses times acertam quase
todos os lançamentos, de qualquer posição na quadra! Pensando bem, o jogo de basquete ficaria
mesmo sem graça se jogadores conseguissem acertar qualquer lançamento, não é mesmo? Uma das
medidas que a OCBR está implantando é uma nova pontuação para os lançamentos, de acordo com a
distância do robô para o início da quadra. A quadra tem 2000 centímetros de comprimento, como na
figura abaixo.
Dada a distância D do robô até o início da quadra, onde está a cesta, a regra é a seguinte:
⮚ Se D ≤ 800, a cesta vale 1 ponto;
⮚ Se 800 < D ≤ 1400, a cesta vale 2 pontos;
⮚ Se 1400 < D ≤ 2000, a cesta vale 3 pontos.
A organização da OIBR precisa de ajuda para automatizar o placar
do jogo. Dado o valor da distância D, você deve escrever um programa
para calcular o número de pontos do lançamento. A entrada de dados
deve ser o valor D indicando a distância do robô para o início da quadra,
em centímetros, no momento do lançamento. Seu programa deve
produzir uma única linha, contendo um inteiro, 1, 2 ou 3, indicando a
pontuação do lançamento.
 */

package LESSON_01.exercise;

import java.util.Scanner;

public class main_task_04 {
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
