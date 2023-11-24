package LESSON_07.exercise.task_03;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida(1000.0);

        contaCorrente.deposita(100);
        System.out.println(contaCorrente.toString());
        contaCorrente.saca(50);
        System.out.println(contaCorrente.toString());
        contaPoupanca.deposita(100);
        System.out.println("---------------------------------------");
        System.out.println(contaPoupanca.toString());
        contaPoupanca.saca(50);
        System.out.println(contaPoupanca.toString());
        System.out.println("---------------------------------------");
        seguroDeVida.deposita(100);
        System.out.println(seguroDeVida.toString());
        seguroDeVida.saca(50);
        System.out.println(seguroDeVida.toString());

    }
}
