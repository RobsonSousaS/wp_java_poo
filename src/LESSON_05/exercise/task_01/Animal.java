package LESSON_05.exercise.task_01;

public class Animal {
    private String name;
    private float length;
    private int numberPaws;
    private String color;
    private String environment;
    private float averageSpeed;

    public Animal(String name, float length, int numberPaws, String color, String environment, float averageSpeed) {
        this.name = name;
        this.length = length;
        this.numberPaws = numberPaws;
        this.color = color;
        this.environment = environment;
        this.averageSpeed = averageSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getNumberPaws() {
        return numberPaws;
    }

    public void setNumberPaws(int numberPaws) {
        this.numberPaws = numberPaws;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public float getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(float averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void dados() {
        System.out.println("Nome: " + getName());
        System.out.println("Comprimento: " + getLength());
        System.out.println("Quantidade de Pernas: " + getNumberPaws());
        System.out.println("color: " + getcolor());
        System.out.println("Ambiente: " + getEnvironment());
        System.out.println("Velocidade Media: " + getAverageSpeed());

    }

}
