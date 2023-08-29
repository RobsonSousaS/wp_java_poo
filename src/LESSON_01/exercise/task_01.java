/*
Pegando uma nota de 50 reais e a cortarmos, usando uma tesoura, em dois pedaços, quanto vale
cada um dos pedaços? A regra é simples: se um dos pedaços possuir estritamente mais da metade da
área da nota original, então ele vale 50 reais; e o outro pedaço não vale nada. Veja que se cada pedaço
possuir exatamente metade da área original, então nenhum dos dois tem valor.
Francisco e Francisca decidiram fazer um corte, em linha reta, que comece no lado inferior da
nota, a base, e termine no lado superior, o topo. A
nota é um retângulo de comprimento 160
centímetros e altura 70 centímetros, como
mostrado na parte esquerda da figura abaixo.
Francisco sempre vai ficar com o pedaço mais à
esquerda da nota e Francisca com o pedaço mais
à direita. A parte direita da figura ilustra dois
possíveis cortes. No de cima, Francisca ficaria
claramente com o maior pedaço, que vale 50 reais;
e no de baixo, dá para ver que Francisco é quem
ficaria com o maior pedaço.
O corte reto vai começar na base a uma distância de B centímetros a partir do lado esquerdo da
nota; e terminar no topo a uma distância de T centímetros também a partir do lado esquerdo da nota.
Veja a indicação na parte direita da figura.
Neste problema, dados os valores B e T, seu programa deve computar quem vai ficar com o
pedaço que vale 50 reais (Francisco ou Francisca), ou se o valor da nota se perdeu.
 */

package LESSON_01.exercise;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o valor de B (distância da base):");
            int B = scanner.nextInt();
            
            System.out.println("Informe o valor de T (distância do topo):");
            int T = scanner.nextInt();
            
            int comprimentoTotal = 160;
            int alturaTotal = 70;
            
            int areaNotaOriginal = comprimentoTotal * alturaTotal;
            
            int areaPedaçoEsquerdo = B * alturaTotal;
            int areaPedaçoDireito = (comprimentoTotal - T) * alturaTotal;
            
            if (areaPedaçoEsquerdo > areaNotaOriginal / 2) {
                System.out.println("Francisco fica com o pedaço de 50 reais.");
            } else if (areaPedaçoDireito > areaNotaOriginal / 2) {
                System.out.println("Francisca fica com o pedaço de 50 reais.");
            } else {
                System.out.println("O valor da nota se perdeu, nenhum dos pedaços vale 50 reais.");
            }
        }
    }
}