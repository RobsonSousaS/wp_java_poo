/*
Crie uma classe Produto para representar um produto do mundo real, com os seguintes atributos e
métodos:
1) Campo de dados privado do tipo String chamado nome, que representará o nome do produto.
2) Campo de dados privado do tipo double chamado precoCusto.
3) Campo de dados privado do tipo double chamado precoVenda.
4) Um campo de dados privado do tipo double chamado margemLucro.
5) Métodos públicos get() e set() para os atributos acima. Modifique o método setPrecoVenda() para que
o preço de venda não seja inferior ao preço de compra. Caso isso aconteça, exiba uma mensagem
alertando o usuário.
6) Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do produto.
7) Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de lucro como
percentual.
Para finalizar, no método main() da classe de teste, crie um novo objeto da classe Produto, peça para o
usuário informar os preços de custo e de venda e exiba a margem de lucro em moeda e em percentual.
 */
package LESSON_04.exercise;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto(String nome, double precoCusto, double precoVenda, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        if (precoVenda >= precoCusto) {
            this.precoVenda = precoVenda;
        } else {
            System.out.println("O preço de venda nao pode ser menor que o preço de custo.");
            this.precoVenda = precoCusto;
            System.exit(0);
        }
        this.margemLucro = margemLucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= precoCusto) {
            this.precoVenda = precoVenda;
        } else {
            System.out.println("O preço de venda não pode ser menor que o preço de custo.");
            System.exit(0);
        }
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    // Método para calcular a margem de lucro em valor absoluto
    public double calcularMargemLucro() {
        return precoVenda - precoCusto;
    }

    // Método para calcular a margem de lucro como percentual
    public double getMargemLucroPorcentagem() {
        return (calcularMargemLucro() / precoCusto) * 100;
    }

}
