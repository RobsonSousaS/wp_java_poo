package LESSON_04.exercise.task_02;

import java.util.Scanner;

public class main_task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita informações do produto ao usuário
        System.out.println("Informe o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Informe o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Informe o preço de venda do produto:");
        double precoVenda = scanner.nextDouble();

        System.out.println("Informe a margem de lucro do produto em percentual:");
        double margemLucro = scanner.nextDouble();

        // Cria um objeto Produto com as informações fornecidas
        Produto produto = new Produto(nome, precoCusto, precoVenda, margemLucro);

        // Exibe os resultados
        System.out.println("\nInformações do Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço de Custo: R$" + produto.getPrecoCusto());
        System.out.println("Preço de Venda: R$" + produto.getPrecoVenda());
        System.out.println("Margem de Lucro: R$" + produto.calcularMargemLucro());
        System.out.println("Margem de Lucro (%): " + produto.getMargemLucroPorcentagem() + "%");

        // Fecha o scanner
        scanner.close();
    }
}