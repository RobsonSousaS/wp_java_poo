package LESSON_07.exercise.task_01;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(12.3, 12.0, "vemelho");
        Quadrado quadrado = new Quadrado(3, 12, "rosa");
        Circulo circulo = new Circulo(12.3, "azul");
        Retangulo retangulo = new Retangulo(12.3, 12.0, "verde");

        System.out.println(triangulo.toString());
        System.out.println("-----------------------");
        System.out.println(quadrado.toString());
        System.out.println("-----------------------");
        System.out.println(circulo.toString());
        System.out.println("-----------------------");
        System.out.println(retangulo.toString());
        System.out.println("-----------------------");

    }
}
