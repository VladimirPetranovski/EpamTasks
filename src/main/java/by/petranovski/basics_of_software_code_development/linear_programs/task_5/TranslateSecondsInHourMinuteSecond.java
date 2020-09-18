package by.petranovski.basics_of_software_code_development.linear_programs.task_5;
/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class TranslateSecondsInHourMinuteSecond {
    public static void main(String[] args) {
        long t = 366388967643424456L;
        long hour = t / 3600;
        long min = (t - hour * 3600) / 60;
        long second = (t - hour * 3600) - min * 60;
        System.out.println("В натуральном числе " + t + ": " + hour + "ч " + min + "мин " + second + "с.");
    }
}
