package by.petranovski.basics_of_software_code_development.linear_programs.task_2;

public class ExpressionValue {
    public static void main(String[] args) {
        System.out.println(value(2, 3, 1));
    }

    private static double value(double a, double b, double c) {
        double z = (b + Math.sqrt((Math.pow(b, 2)) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return z;
    }
}
