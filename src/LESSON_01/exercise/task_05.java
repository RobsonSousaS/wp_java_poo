package LESSON_01.exercise;

public class task_05 {
    public static void main(String[] args) {
        int[] pos = new int[16];
        int posLiu = 0;
        int posZhao = 0;
        int j = 1;
        for (int i = 0; i < 16; i++) {
            pos[i] = j;
            j++;
        }

        for (int i = 0; i < 16; i++) {
            if (pos[i] == 7) {
                posLiu = i;

            } else if (pos[i] == 1) {
                posZhao = i;

            }
        }
        if ((posZhao / 8) == (posLiu / 8)) {
            System.out.println("Semifinal do campeonato");
        } else if ((posLiu / 4) == (posZhao / 4)) {
            System.out.println("Quartas de final do campenato");
        } else if ((posZhao / 2) == (posLiu / 2)) {
            System.out.println("Oitavas de final do campeonato");
        } else {
            System.out.println("Final do campeonato");
        }

    }
}
