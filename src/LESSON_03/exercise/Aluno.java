package LESSON_03.exercise;

import java.text.DecimalFormat;

class Aluno {
    private String matricula;
    private String nome;
    public double notaEtapa1Avaliacao1;
    public double notaEtapa1Avaliacao2;
    public double notaEtapa2Avaliacao1;
    public double notaEtapa2Avaliacao2;
    private double mediaEtapa1;
    private double mediaEtapa2;
    private double mediaFinal;
    private String resultadoFinal;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void calculaMediaPorEtapa(double pesoAvaliacao1, double pesoAvaliacao2) {
        this.mediaEtapa1 = (notaEtapa1Avaliacao1 * pesoAvaliacao1 + notaEtapa1Avaliacao2 * pesoAvaliacao2)
                / (pesoAvaliacao1 + pesoAvaliacao2);
        this.mediaEtapa2 = (notaEtapa2Avaliacao1 * pesoAvaliacao1 + notaEtapa2Avaliacao2 * pesoAvaliacao2)
                / (pesoAvaliacao1 + pesoAvaliacao2);
    }

    public void calculaMediaFinal() {
        this.mediaFinal = (mediaEtapa1 + mediaEtapa2) / 2;
    }

    public void calculaResultadoFinal(double mediaMinimaAprovacao, double mediaMinimaAvaliacaoFinal) {
        if (mediaFinal >= mediaMinimaAprovacao) {
            this.resultadoFinal = "Aprovado";
        } else if (mediaFinal >= mediaMinimaAvaliacaoFinal) {
            this.resultadoFinal = "Avaliação Final";
        } else {
            this.resultadoFinal = "Reprovado";
        }
    }

    public String apresentaResultado() {
        DecimalFormat df = new DecimalFormat("0.00");
        String mediaFinalFormatada = df.format(mediaFinal);
        
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nMédia Etapa 1: " + mediaEtapa1 + "\nMédia Etapa 2: "
                + mediaEtapa2 + "\nMédia Final: " + mediaFinalFormatada + "\nResultado Final: " + resultadoFinal;
    }
}
