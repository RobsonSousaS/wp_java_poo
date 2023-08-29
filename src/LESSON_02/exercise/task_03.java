/*
Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3
centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para
que Zé seja maior que Chico.
 */

package LESSON_02.exercise;

public class task_03 {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
        int anos = 0;

        while (ze < chico) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        }
        System.out.println("Sao exatamente " + anos + " anos para Zé ser maior que Chico");
        }
    }