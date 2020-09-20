package by.petranovski.basics_of_software_code_development.branching.task_5;
/*
Вычислить значение функции
 */

public class FunctionValue {
    private static void functionValue(double x) {
        double fx = 0;
        System.out.println(fx = (x <= 3) ? (Math.pow(x, 2) - 3 * x + 9) : (1 / ( Math.pow(x, 3) + 6)));
    }

    public static void main(String[] args) {
        functionValue(2);
    }
}
