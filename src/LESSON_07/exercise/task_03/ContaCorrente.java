package LESSON_07.exercise.task_03;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        double tributo = getSaldo() * 0.03;
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
        return "ContaCorrente [" + "Saldo atualmente: " + getSaldo() + "]";
    }

}
