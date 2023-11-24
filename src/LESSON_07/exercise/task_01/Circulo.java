package LESSON_07.exercise.task_01;

import java.text.DecimalFormat;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio= " + raio + " cor= " + getCor() + " Diametro= " + getDiametro() + "]";
    }

    public double getDiametro() {
        double diametro = raio * 3.14 * 2;
        DecimalFormat df = new DecimalFormat("#,##");
        return Double.parseDouble(df.format(diametro));
    }

}
