package by.petranovski.basics_of_software_code_development.cycles.task_8;
/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.Arrays;

class TwoNumbers {
    private static void findNumbersEqualsFirstAndSecondNumbers(long n, long m) {
        long d;
        byte c;
        long count = 0;
        while (n > 0) {
            c = (byte) ((byte)n % 10);
            d = m;
            while (d > 0) {
                if (d % 10 == c) {
                    System.out.println(d % 10);
                }
                d = d / 10;
            }
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        findNumbersEqualsFirstAndSecondNumbers(12345, 235);
    }
}
