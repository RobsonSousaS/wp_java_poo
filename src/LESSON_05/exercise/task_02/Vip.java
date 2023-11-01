package LESSON_05.exercise.task_02;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return super.getValor() + valorAdicional;
    }
}
