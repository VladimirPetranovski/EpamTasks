package by.petranovski.basics_of_software_code_development.linear_programs.task_6;
/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае
 */

public class LinearProgramsIsShadedArea {
    private static boolean isBelongsOfTheShadedArea(double x, double y) {
        if (((x >= -2.0 && x <= 2.0) && (y >= 0.0 && y <= 4.0)) || ((x >= -4.0 && x <= 4.0) && (y <= 0.0 && y >= -3.0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isBelongsOfTheShadedArea(3.0, 1.0));
    }
}
