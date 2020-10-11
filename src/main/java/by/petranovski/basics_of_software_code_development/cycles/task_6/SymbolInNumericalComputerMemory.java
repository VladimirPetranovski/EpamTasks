package by.petranovski.basics_of_software_code_development.cycles.task_6;
/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

class SymbolInNumericalComputerMemory {
    private static void symbolInNumericalComputerMemory (String text) {
        findNumerical(text, dividedStingInArrayChar(text));
    }

    private static char[] dividedStingInArrayChar(String text) {
        char[] arr = text.toCharArray();
        return arr;
    }

    private static void findNumerical(String text, char[] arr) {
        for (int i = 0; i < dividedStingInArrayChar(text).length; i++) {
            System.out.println(arr[i] + " соответсвует " + (int)arr[i]);
        }
    }

    public static void main(String[] args) {
        symbolInNumericalComputerMemory("dsfgkghghf;l_");
    }

}
