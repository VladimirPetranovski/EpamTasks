package by.petranovski.basics_of_software_code_development.branching.task_2;
/*
 Найти max{min(a, b), min(c, d)}.
 */

public class MaxFromMin {
    private static void max(double a, double b, double c, double d) {
    /*    double max = 0;
        if (Math.min(a, b) > Math.min(c, d)) {
            System.out.println(max = Math.min(a, b));
        } else {
            System.out.println(max = Math.min(c, d));
        }*/
        double minAb;
        double minCd;
        double max;

        if (a < b) {
            minAb = a;
        } else {
            minAb = b;
        }

        if (c < d) {
            minCd = c;
        } else {
            minCd = d;
        }

        if (minAb > minCd) {
            max = minAb;
        } else {
            max = minCd;
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        max(5.0, 7.3, 9.0, 8.3);
    }
}
