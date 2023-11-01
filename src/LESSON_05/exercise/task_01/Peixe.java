package LESSON_05.exercise.task_01;

public class Peixe extends Animal {
    private String characteristics = """

            """;;

    public Peixe(String name, float length, int numberPaws, String color, String environment, float averageSpeed,
            String characteristics) {
        super(name, length, numberPaws, color, environment, averageSpeed);
        this.characteristics = characteristics;
    }

    @Override
    public void dados() {
        System.out.println("Nome: " + getName());
        System.out.println("Comprimento: " + getLength());
        System.out.println("Quantidade de patas: " + getNumberPaws());
        System.out.println("Cor: " + getcolor());
        System.out.println("Ambiente: " + getEnvironment());
        System.out.println("Velocidade média: " + getAverageSpeed());
        System.out.println("Características do peixe: " + getCharacteristics());

    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

}
