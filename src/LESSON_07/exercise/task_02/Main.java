package LESSON_07.exercise.task_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Caminhao> caminhoes = new ArrayList<>();
        Caminhao caminhao = new Caminhao(null, 0, 0);
        ArrayList<Onibus> onibusAL = new ArrayList<>();
        Onibus onibus = new Onibus(null, 0, 0);
        Scanner scanner = new Scanner(System.in);

        while (caminhoes.size() <= 2) {
            System.out.println("Digite a placa do caminhão:");
            String placa = scanner.next();
            caminhao.setPlaca(placa);
            System.out.println("Digite o ano do caminhão:");
            int ano = scanner.nextInt();
            caminhao.setAno(ano);
            System.out.println("Digitel quantos eixos tem o caminhao:");
            int eixo = scanner.nextInt();
            caminhao.setEixos(eixo);
            caminhoes.add(caminhao);
        }

        while (onibusAL.size() <= 2) {
            System.out.println("Digite a placa do onibus:");
            String placa = scanner.next();
            onibus.setPlaca(placa);
            System.out.println("Digite o ano do onibus:");
            int ano = scanner.nextInt();
            onibus.setAno(ano);
            System.out.println("Digitel quantos assentos tem o onibus:");
            int assentos = scanner.nextInt();
            onibus.setAssentos(assentos);
            onibusAL.add(onibus);
        }

        caminhao.exibeDados(caminhoes);

        onibus.exibeDados(onibusAL);

        scanner.close();
    }
}
