package LESSON_01.explanation;
import java.util.Scanner;

public class explanation {
    
    public static void main(String[] args) {

        String nome = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            nome = entrada.nextLine();
            System.out.println("Digite sua nota1: ");
            nota1 = entrada.nextDouble();
            System.out.println("Digite sua nota2: ");
            nota2 = entrada.nextDouble();
        }
        media = (nota1 + nota2) / 2;
        System.out.println(nome + " sua meida atualmente é: " + media);
    }

}
