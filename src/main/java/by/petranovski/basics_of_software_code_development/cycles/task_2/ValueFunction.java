package by.petranovski.basics_of_software_code_development.cycles.task_2;
/*
 Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class ValueFunction {
    private static void yx(int a, int b, int h) {
        int x, y;
        for (int i = a; i <= b ; i+= h) {
            x = i;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        yx(-5, 7, 3);
    }
}
