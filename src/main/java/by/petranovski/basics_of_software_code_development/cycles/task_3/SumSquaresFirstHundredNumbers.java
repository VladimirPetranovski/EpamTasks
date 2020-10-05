package by.petranovski.basics_of_software_code_development.cycles.task_3;
/*
Найти сумму квадратов первых ста чисел
 */

class SumSquaresFirstHundredNumbers {
    private static int sumSquaresFirstHundredNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSquaresFirstHundredNumbers());
    }
}
