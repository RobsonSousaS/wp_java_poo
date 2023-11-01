// Neste problema, Crie uma classe chamada Ingresso que possui um valor em reais e um método
// imprimeValor().
// a) Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que retorne
// o valor do ingresso VIP (com o adicional incluído).
// b) Crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso
// Normal".
// c) Crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar e
// imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor
// adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes
// herdam a classe VIP.

package LESSON_05.exercise.task_02;

public class main_task_02 {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50.0);
        ingressoNormal.imprimeValor();

        Vip ingressoVIP = new Vip(70.0, 20.0);
        double valorIngressoVIP = ingressoVIP.getValorAdicional();
        System.out.println("Valor do Ingresso VIP: R$" + valorIngressoVIP);

        CamaroteInferior camaroteInferior = new CamaroteInferior(80.0, 30.0, "Camarote Inferior");
        camaroteInferior.imprimeValor();
        camaroteInferior.imprimeLocalizacao();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0);
        double valorIngressoCamaroteSuperior = camaroteSuperior.getValorIngresso();
        System.out.println("Valor do Camarote Superior: R$" + valorIngressoCamaroteSuperior);

    }
}