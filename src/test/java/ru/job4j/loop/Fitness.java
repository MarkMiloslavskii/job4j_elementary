package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(calc(95, 90));
        System.out.println(calc(90, 95));
        System.out.println(calc(50, 90));
        System.out.println(calc(90, 90));
        System.out.println(calc(30, 150));
    }
}
