package by.petranovski.basics_of_software_code_development.cycles.task_4;
/*
Составить программу нахождения произведения квадратов первых двухсот чисел
 */

import java.math.BigInteger;

class MultiplyFirstTwoHundredNumbers {

    public static void main(String[] args) {
        task();
    }

    private static void task() {

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {

            result = result.multiply(new BigInteger(String.valueOf(i * i)));
        }
        System.out.println(result);
    }
}
