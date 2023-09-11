package LESSON_03.exercise;

import java.util.Date;

public class Voo {
    private int numeroVoo;
    private Date dataVoo;
    private boolean[] ocupacaoCadeiras;

    public Voo(int numeroVoo, Date dataVoo) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        this.ocupacaoCadeiras = new boolean[100]; // Inicialmente, todas as cadeiras estão vazias
    }

    public int proximoLivre() {
        for (int i = 0; i < ocupacaoCadeiras.length; i++) {
            if (!ocupacaoCadeiras[i]) {
                return i + 1;
            }
        }
        return -1; 
    }

    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            return false; 
        }
        return ocupacaoCadeiras[numeroCadeira - 1]; 
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            return false; 
        }
        if (!ocupacaoCadeiras[numeroCadeira - 1]) {
            ocupacaoCadeiras[numeroCadeira - 1] = true;
            return true;
        }
        return false;
    }

    public int retornaVagas() {
        int vagasDisponiveis = 0;
        for (boolean ocupada : ocupacaoCadeiras) {
            if (!ocupada) {
                vagasDisponiveis++;
            }
        }
        return vagasDisponiveis;
    }

    public int retornaVoo() {
        return numeroVoo;
    }

    public Date retornaData() {
        return dataVoo;
    }
}