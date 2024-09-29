package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        double rate = percent / 100;
        do {
            total = total + total * rate;
            total = total + annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }

    public static void main(String[] args) {
        System.out.println(years(500, 100, 5));
        System.out.println(years(1000, 200, 10));
        System.out.println(years(1000, 100, 20));
    }
}