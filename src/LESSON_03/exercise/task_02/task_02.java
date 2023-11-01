/*
Escreva um programa que receba os dados de um aluno matriculado em um disciplina do IFCE. Para isso
crie uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas da etapa 1 e 2 notas da etapa
2, média da etapa 1, média da etapa 2 e média final e resultado final (Aprovado, Reprovado, Avaliação
Final. Faz o programa para testar a classe. Escreva os seguintes métodos para esta classe:
calculaMediaPorEtapa Recebe código da etapa e pesos de cada avaliação e calcula a média da etapa
calculaMediaFinal Calcula a média final do aluno
calculaResultadoFinal Calcula o resultado final (Aprovado, Reprovado, Avaliação Final)
apresentaResultado Cria string com o resultado final com todos os dados do aluno
 */

package LESSON_03.exercise.task_02;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome);

            System.out.print("Digite a nota da etapa 1, avaliaçao 1: ");
            aluno.notaEtapa1Avaliacao1 = scanner.nextDouble();
            System.out.print("Digite a nota da etapa 1, avaliaçao 2: ");
            aluno.notaEtapa1Avaliacao2 = scanner.nextDouble();
            System.out.print("Digite a nota da etapa 2, avaliaçao 1: ");
            aluno.notaEtapa2Avaliacao1 = scanner.nextDouble();
            System.out.print("Digite a nota da etapa 2, avaliaçao 2: ");
            aluno.notaEtapa2Avaliacao2 = scanner.nextDouble();

            aluno.calculaMediaPorEtapa(2.0, 3.0); // Peso 2 para Avaliação 1 e Peso 3 para Avaliação 2
            aluno.calculaMediaFinal();
            aluno.calculaResultadoFinal(6.0, 5.0); // Média mínima de aprovação e média mínima de avaliação final

            String resultado = aluno.apresentaResultado();
            System.out.println("\nResultado do Aluno:\n" + resultado);
        }
    }

}
