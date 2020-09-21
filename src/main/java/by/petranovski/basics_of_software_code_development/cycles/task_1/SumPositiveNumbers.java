package by.petranovski.basics_of_software_code_development.cycles.task_1;
/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class SumPositiveNumbers {
    private static void sumPositiveNumbers() {
        System.out.println("Enter any positive number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumPositiveNumbers();
    }
}
