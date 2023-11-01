/*
Escreva uma classe Círculo para representar círculos com os seguintes atributos e métodos:
a) Uma variável privada do tipo double chamada raio que guardará o valor do raio atual do circulo.
b) Métodos get() e set() públicos que permitem definir e acessar o valor da variável raio.
c) Um construtor que recebe o valor do raio como argumento.
d) Um método getArea() que calcula e retorna a área do círculo.
e) Um método getCircunferencia() que calcula e retorna a circunferência do círculo.
f) Um método aumentarRaio() que recebe um valor double e o usa como percentual para aumentar o
raio do círculo.
Crie um programa principal para testar as funcionalidades da classe Circulo..
 */
package LESSON_04.exercise.task_01;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void getCircunferencia() {
        System.out.printf("A circunferência do círculo eh %.2f \n", (2 * Math.PI * raio));
    }

    public void aumentarRaio(double percentual) {
        if (percentual >= 0) {
            double aumento = raio * (percentual / 100);
            raio += aumento;
            System.out.println("O valor do raio após o aumento eh " + raio);
        } else {
            System.out.println("O percentual de aumento deve ser um valor nao negativo.");
        }
    }
}
