package by.petranovski.basics_of_software_code_development.linear_programs.task_4;
/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой части). Поменять местами
дробную и целую части числа и вывести полученное значение числа
*/

public class RealNumberChangePlace {
    public static void main(String[] args) {
        task(123.456);
    }
    private static void task(double r) {
        System.out.println((double)((int)((r - (int) r) * 1000)) + (double)((int) r) / 1000);
    }
}
