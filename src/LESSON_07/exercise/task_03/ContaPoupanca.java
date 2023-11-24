package LESSON_07.exercise.task_03;

public class ContaPoupanca extends Conta implements Tributavel {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return 0;
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
        return "ContaPoupanca [" + "Saldo atualmente: " + getSaldo() + "]";
    }

}