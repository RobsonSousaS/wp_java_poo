// Neste problema, crie uma classe Animal que obedeça à seguinte descrição: possua os atributos nome
// (String), comprimento (float), número de patas (int), cor (String), ambiente (String) e velocidade média
// (float) . Em seguida, crie um método construtor que receba por parâmetro os valores iniciais de cada
// um dos atributos e atribua-os aos seus respectivos atributos. Além disso, crie os métodos get e set para
// cada um dos atributos. Por fim, crie um método dados, sem parâmetro e do tipo void, que, quando
// chamado, imprime na tela uma espécie de relatório informando os dados do animal.
// Agora, crie uma classe Peixe que herde da classe Animal e obedeça à seguinte descrição: possua um
// atributo caracteristica(String). Em seguida, crie um método construtor que receba por parâmetro os
// valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus
// respectivos atributos. Também crie ainda os métodos get e set para o atributo caracteristica. Crie um
// método dadosPeixe sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie
// de relatório informando os dados do peixe (incluindo os dados do Animal e mais a característica).
// Em seguida, crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição:
// possua um atributo alimento(String) Crie um método construtor que receba por parâmetro os valores
// iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus
// respectivos atributos. Crie ainda os métodos get e set para o atributo alimento. Crie um método
// dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de
// relatório informando os dados do mamifero (incluindo os dados do Animal e mais o alimento).
// Por fim, altere as classes criadas anteriormente, de modo que o método dados da classe Animal seja
// sobrescrito nas subclasses. Em seguida, uma classe TestarAnimais possua um método main para testar
// as classes criadas.

package LESSON_05.exercise.task_01;

public class main_task_01 {
    public static void main(String[] args) {
        Peixe animal1 = new Peixe("Tilapia", 40, 0, "Azul", "Água Doce", 0,
                """
                        A tilápia é um peixe de água doce que podem medir entre 40 cm
                        e 90 cm e pesar até 12 kg, dependendo da espécie
                        """);
        Mamifero mamifero1 = new Mamifero("Cachorro", 110, 4, "Variadas", "Casas", 100, "Raçao");

        animal1.dados();

        mamifero1.dados();

    }
}
