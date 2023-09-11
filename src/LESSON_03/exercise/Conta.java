package LESSON_03.exercise;

class Conta {
    private String nome;
    private String agencia;
    private String idConta;
    private double saldo;

    public Conta(String nomeTitular, String agencia, String idConta, double saldoIni) {
        this.nome = nomeTitular;
        this.agencia = agencia;
        this.idConta = idConta;
        this.saldo = saldoIni;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void extrato() {
        System.out.println("Nome do Titular: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + idConta);
        System.out.println("Saldo: R$" + saldo);
    }
}