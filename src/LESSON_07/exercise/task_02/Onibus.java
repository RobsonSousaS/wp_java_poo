package LESSON_07.exercise.task_02;

import java.util.ArrayList;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibeDados(ArrayList<Onibus> onibusAL) {
        for (Onibus onibus : onibusAL) {
            System.out.println(
                    "Placa: " + onibus.getPlaca() + " Ano: " + onibus.getAno() + " Assentos: " + onibus.getAssentos());
        }
    }

}
