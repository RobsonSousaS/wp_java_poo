package LESSON_05.exercise.task_01;

public class Mamifero extends Animal {
    private String food;

    public Mamifero(String name, float length, int numberPaws, String color, String environment, float averageSpeed,
            String food) {
        super(name, length, numberPaws, color, environment, averageSpeed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void dados() {
        System.out.println("Nome: " + getName());
        System.out.println("Comprimento: " + getLength());
        System.out.println("Quantidade de pés: " + getNumberPaws());
        System.out.println("Cor: " + getcolor());
        System.out.println("Ambiente: " + getEnvironment());
        System.out.println("Velocidade média: " + getAverageSpeed());
        System.out.println("Alimentação: " + food);

    }

}
