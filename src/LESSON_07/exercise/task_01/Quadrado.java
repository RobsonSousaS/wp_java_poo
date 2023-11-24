package LESSON_07.exercise.task_01;

public class Quadrado extends Retangulo {

    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
    }

    @Override
    public String toString() {
        return "Quadrado [lado1= " + getLado1() + ", lado2= " + getLado2() + " cor= " + getCor() + " area= " + area()
                + "]";
    }

}
