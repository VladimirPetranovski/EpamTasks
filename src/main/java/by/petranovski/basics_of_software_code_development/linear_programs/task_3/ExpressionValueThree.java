package by.petranovski.basics_of_software_code_development.linear_programs.task_3;

public class ExpressionValueThree {
    public static void main(String[] args) {
        System.out.println(value(30, 90));
    }
    private static double value(double x, double y) {
        double c = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        return c;
    }
}
