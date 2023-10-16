package LESSON_04.exercise_task_03_repository;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Biblioteca {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opçao:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Cadastrar Pessoa
                    System.out.println("Informe o nome completo:");
                    scanner.nextLine(); // Limpar o buffer
                    String nomeCompleto = scanner.nextLine();
                    System.out.println("Informe o CPF:");
                    String cpf = scanner.next();
                    System.out.println("Informe o e-mail:");
                    String email = scanner.next();
                    System.out.println("Informe o endereço:");
                    scanner.nextLine(); // Limpar o buffer
                    String endereco = scanner.nextLine();
                    System.out.println("Informe o telefone:");
                    String telefone = scanner.next();
                    Pessoa pessoa = new Pessoa(nomeCompleto, cpf, email, endereco, telefone);
                    pessoas.add(pessoa);
                    System.out.println("Pessoa cadastrada com sucesso.");
                    break;
                case 2:
                    // Cadastrar Livro
                    System.out.println("Informe o título do livro:");
                    scanner.nextLine(); // Limpar o buffer
                    String tituloLivro = scanner.nextLine();
                    System.out.println("Informe o(s) autor(es) do livro:");
                    String autoresLivro = scanner.nextLine();
                    System.out.println("Informe o ano de publicação:");
                    int anoLivro = scanner.nextInt();
                    System.out.println("Informe a editora do livro:");
                    scanner.nextLine();
                    String edidoraLivro = scanner.nextLine();
                    Livro livro = new Livro(tituloLivro, autoresLivro, anoLivro, edidoraLivro);
                    livros.add(livro);
                    System.out.println("Livro cadastrado com sucesso.");
                    break;
                case 3:
                    // Realizar Empréstimo
                    System.out.println("Lista de Pessoas:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + 1 + ". " + pessoas.get(i).getNome());
                    }
                    System.out.println("Selecione o número da pessoa:");
                    int numPessoa = scanner.nextInt();
                    System.out.println("Lista de Livros:");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println(i + 1 + ". " + livros.get(i).getTitulo());
                    }
                    System.out.println("Selecione o número do livro:");
                    int numLivro = scanner.nextInt();

                    Pessoa pessoaSelecionada = pessoas.get(numPessoa - 1);
                    Livro livroSelecionado = livros.get(numLivro - 1);
                    Emprestimo emprestimo = new Emprestimo(pessoaSelecionada, livroSelecionado);
                    emprestimos.add(emprestimo);
                    System.out.println("Empréstimo realizado com sucesso.");
                    break;
                case 4:
                    // Sair do programa
                    System.out.println("Obrigado por usar o sistema de biblioteca. Adeus!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
