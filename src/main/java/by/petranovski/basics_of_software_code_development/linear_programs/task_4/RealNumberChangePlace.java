package by.petranovski.basics_of_software_code_development.linear_programs.task_4;
/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа
 */
public class RealNumberChangePlace {
    public static void main(String[] args) {
        double r = 123.456;
        int n = (int)r;
        int d = (int)((r - n) * 1000);
        double z = (double)d + ((double)n / 1000);
        System.out.println(z);
    }
}
