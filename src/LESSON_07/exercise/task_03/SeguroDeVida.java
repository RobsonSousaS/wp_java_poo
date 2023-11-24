package LESSON_07.exercise.task_03;

public class SeguroDeVida extends Conta implements Tributavel {

    public SeguroDeVida(double saldo) {
        super(saldo);

    }

    @Override
    public double calculaTributos() {
        double tributo = 35;
        return tributo;
    }

    @Override
    public void deposita(double valor) {
        setSaldo((getSaldo() + valor) - calculaTributos());
    }

    @Override
    public void saca(double valor) {
        if (valor < getSaldo()) {
            setSaldo((getSaldo() - valor) - calculaTributos());
        } else {
            System.out.println("saldo insuficiente");
        }

    }

    @Override
    public String toString() {
        return "SeguroDeVida [" + "Saldo atualmente: " + getSaldo() + "]";
    }

}