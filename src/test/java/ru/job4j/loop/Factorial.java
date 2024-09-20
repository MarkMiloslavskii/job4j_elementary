package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        if (number < 0) {
            System.out.print("Number must be a positive integer greater than ");
            return 0;
        }
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
        System.out.println(calculate(0));
        System.out.println(calculate(-3));
        System.out.println(calculate(8));

    }
}