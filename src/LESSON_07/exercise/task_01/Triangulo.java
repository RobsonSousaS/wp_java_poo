package LESSON_07.exercise.task_01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public BigDecimal area() {
        double val = base * altura;
        BigDecimal valForm = new BigDecimal(val).setScale(2, RoundingMode.HALF_UP);
        return valForm;
    }

    @Override
    public String toString() {
        return "Triangulo [base= " + base + ", altura= " + altura + " cor= " + getCor() + " area= " + area() + "]";
    }

}
