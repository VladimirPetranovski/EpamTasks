package by.petranovski.basics_of_software_code_development.branching.task_1;
/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

public class IsTriangle {
    private static void isTriangle(int a, int b) {
        if ((a + b) >= 180) {
            System.out.println("Triangle not exist");
        } else if ( a == 90 || b == 90 || a + b == 90){
            System.out.println("Triangle is rectangular");
        } else {
            System.out.println("Triangle exist");
        }
    }

    public static void main(String[] args) {
        isTriangle(60, 30);
    }
}
