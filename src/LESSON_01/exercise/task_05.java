/*
O sorteio das posições dos jogadores na chave decisiva da copa do mundo de tênis de mesa está
deixando preocupados. É que ninguém quer pegar o jogador mais bem ranqueado, o Zhao, logo nas
oitavas de final, ou nas quartas de final. Melhor que só seja possível enfrentar Zhao na semifinal ou na
final! Os jogadores são identificados por números inteiros de 1 a 16, sendo que Zhao é o jogador de
número 1. O jogador para o qual nós estamos torcendo, Liu, tem o número 7.
A chave possui 16 posições também numeradas de 1 a 16, como na figura abaixo. A organização
da copa vai fazer um sorteio para definir em qual posição cada jogador vai iniciar a chave decisiva. Nas
oitavas de final, o jogador na posição 1 enfrenta o jogador na posição 2; o da posição 3 enfrenta o da
posição 4; e assim por diante, como na figura.
O objetivo deste problema é decidir em que fase da chave os jogadores Zhao e Liu vão se
enfrentar, caso vençam todas as suas respectivas partidas antes de se enfrentarem. Por exemplo, se o
sorteio da chave determinar a seguinte ordem de jogadores da posição 1 até a 16: [4 11 3 2 8 13 14 5 16
9 12 6 10 7 1 15], eles vão se enfrentar na semifinal.
O programa deverá receber uma
sequência com 16 números inteiros, de
valores entre 1 e 16, em ordem dos
jogadores nas posições da chave decisiva
do campeonato, conforme a figura ao
lado. Seu programa deve indicar qual fase
em que vão se enfrentar os jogadores
Zhao e Liu, se eles vencerem todas as
suas partidas antes de se enfrentarem:
oitavas, quartas, semifinal ou final.
 */

package LESSON_01.exercise;

public class task_05 {
    public static void main(String[] args) {
        int[] pos = new int[16];
        int posLiu = 0;
        int posZhao = 0;
        int j = 1;
        for (int i = 0; i < 16; i++) {
            pos[i] = j;
            j++;
        }

        for (int i = 0; i < 16; i++) {
            if (pos[i] == 7) {
                posLiu = i;

            } else if (pos[i] == 1) {
                posZhao = i;

            }
        }
        if ((posZhao / 8) == (posLiu / 8)) {
            System.out.println("Semifinal do campeonato");
        } else if ((posLiu / 4) == (posZhao / 4)) {
            System.out.println("Quartas de final do campenato");
        } else if ((posZhao / 2) == (posLiu / 2)) {
            System.out.println("Oitavas de final do campeonato");
        } else {
            System.out.println("Final do campeonato");
        }

    }
}
