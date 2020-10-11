package by.petranovski.basics_of_software_code_development.cycles.task_5;
/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: a(n) = 1/2pow(n) + 1/3pow(n)
 */

class NumberSeries {
    static double findSum(int n, double e) {
        double sum = 0;
        for (int i = 1; i < n; i++) {
            double a = 1/ Math.pow(2, i) + 1/ Math.pow(3, i);
            if (e <= a) {
                sum += a;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum(2, 0.01));
    }

}
