package LESSON_07.exercise.task_02;

import java.util.ArrayList;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibeDados(ArrayList<Caminhao> caminhoes) {
        for (Caminhao caminhao : caminhoes) {
            System.out.println(
                    "Placa: " + caminhao.getPlaca() + " Ano: " + caminhao.getAno() + " Eixos: " + caminhao.getEixos());
        }
    }

}
