package LESSON_04.exercise;

public class main_task_01 {
    public static void main(String[] args) {
        Circulo C = new Circulo(0);

        C.setRaio(20);
        System.out.println("Valor do raio do ciruclo eh " + C.getRaio());
        System.out.printf("Area do ciruclo eh %.2f \n", C.getArea());
        C.getCircunferencia();
        C.aumentarRaio(1);

    }

}
