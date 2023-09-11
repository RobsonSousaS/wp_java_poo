/*
Escreva um programa para gerenciar os voos de uma companhia aérea. Para isso crie uma classe em
que cada objeto representa um voo que acontece em determinada data e em determinado horário. Cada
voo possui no máximo 100 passageiros, e a classe permite controlar a ocupação das vagas. Faça um
programa para testar a classe criada. A classe deve ter os seguintes métodos:
construtor Configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para
armazenar a data utilize um objeto da classe Data, criada na questão anterior);

proximoLivre Retorna o número da próxima cadeira livre
verifica Verifica se o número da cadeira recebido como parâmetro está ocupada
ocupa Ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e
retorna True se cadeira ainda não estiver ocupada e False caso contrário
retornaVvagas Retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
retornaVoo Retorna o número do vôo
retornaData Retorna a data do vôo (na forma de objeto)
 */


package LESSON_03.exercise;

import java.sql.Date;

public class task_03 {
  public static void main(String[] args) {
        // Exemplo de uso da classe Voo
        Date dataVoo = new Date(0, 0, 0);
        Voo voo = new Voo(101, dataVoo);

        int proximaCadeiraLivre = voo.proximoLivre();
        System.out.println("Próxima cadeira livre: " + proximaCadeiraLivre);

        boolean ocupada = voo.ocupa(3);
        System.out.println("Cadeira 3 ocupada: " + ocupada);

        ocupada = voo.ocupa(3);
        System.out.println("Cadeira 3 ocupada: " + ocupada);

        int vagasDisponiveis = voo.retornaVagas();
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }
}