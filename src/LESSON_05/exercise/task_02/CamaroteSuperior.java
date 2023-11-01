package LESSON_05.exercise.task_02;

public class CamaroteSuperior extends Vip {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValorIngresso() {
        return super.getValor() + super.getValorAdicional();
    }
}
