/*
Utilizando a classe conta corrente criada no exemplo apresentado em sala de aula, faça um programa
que utilize a classe ContaSimples implemente a lógica do sistema bancário. Para isso, faça um programa
que crie três contas correntes (A, B e C), deposite valores solicitados pelo usuário, e realizei operações de
transferência entre as contas correntes A e B, entre B e C, e entre C e A. O programa deve apresentar o
extrato bancário após cada operação realizada.
 */

package LESSON_03.exercise.task_01;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Conta A = new Conta("TitularA", "64837-3", "A", 0.0);
        Conta B = new Conta("TitularB", "83324-3", "B", 0.0);
        Conta C = new Conta("TitularC", "12345-6", "C", 0.0);
        int opcao;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||                                                           ||");
            System.out.println("|| BEM VINDO AO BANCO DO PEDRO, QUAL OPERACAO DESEJA FAZER? ||");
            System.out.println("|| 1° DEPOSITAR EM SUA CONTA                                 ||");
            System.out.println("|| 2° TRANSFERIR DE A PARA B                                 ||");
            System.out.println("|| 3° TRANSFERIR DE B PARA C                                 ||");
            System.out.println("|| 4° TRANSFERIR DE C PARA A                                 ||");
            System.out.println("|| 0° SAIR DO BANCO                                          ||");
            System.out.println("||                                                           ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");

            System.out.print("Digite a opçao desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar em A: R$");
                    double valorDepositoA = scanner.nextDouble();
                    A.depositar(valorDepositoA);
                    System.out.println("Depósito realizado com sucesso na conta A.");
                    A.extrato();
                    break;
                case 2:
                    System.out.print("Digite o valor a transferir de A para B: R$");
                    double valorTransferenciaAtoB = scanner.nextDouble();
                    A.transferir(B, valorTransferenciaAtoB);
                    System.out.println("Transferência realizada com sucesso de A para B.");
                    A.extrato();
                    B.extrato();
                    break;
                case 3:
                    System.out.print("Digite o valor a transferir de B para C: R$");
                    double valorTransferenciaBtoC = scanner.nextDouble();
                    B.transferir(C, valorTransferenciaBtoC);
                    System.out.println("Transferência realizada com sucesso de B para C.");
                    B.extrato();
                    C.extrato();
                    break;
                case 4:
                    System.out.print("Digite o valor a transferir de C para A: R$");
                    double valorTransferenciaCtoA = scanner.nextDouble();
                    C.transferir(A, valorTransferenciaCtoA);
                    System.out.println("Transferência realizada com sucesso de C para A.");
                    C.extrato();
                    A.extrato();
                    break;
                case 0:
                    System.out.println("Saindo do banco. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}