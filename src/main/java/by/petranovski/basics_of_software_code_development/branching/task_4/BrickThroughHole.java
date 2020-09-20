package by.petranovski.basics_of_software_code_development.branching.task_4;
/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие
 */

public class BrickThroughHole {
    private static void isFitBrick(int a, int b, int x, int y, int z) {
        /*if ((a > x && b > y) || (a > y && b > z)) {
            System.out.println("Brick will fit through the hole");
        } else {
            System.out.println("Brick wont fit through the hole");
        }*/
        String result = ((a > x && b > y) || (a > y && b > z)) ? "Brick will fit through the hole" : "Brick wont fit through the hole";
        System.out.println(result);
    }

    public static void main(String[] args) {
        isFitBrick(4, 7, 1, 2, 8);
    }
}
