package by.petranovski.basics_of_software_code_development.branching.task_3;
/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class ThreePoints {
    private static void straightLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Three points lie on one straight line");
        } else {
            System.out.println("Three points not lie on one straight line");
        }
    }

    public static void main(String[] args) {
        straightLine(1, 1, 2, 2, 3, 3);
    }
}
