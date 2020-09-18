package by.petranovski.basics_of_software_code_development.linear_programs.task_5;
/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class TranslateSecondsInHourMinuteSecond {
    public static void main(String[] args) {
        task(323277718977L);
    }
    private static void task(long t) {
        System.out.println(t / 3600 + "ч " + (t % 3600) / 60 + "м " + (t % 3600) % 60 + "с");
    }
}
