package ru.job4j.loop;

public class PrimeNumber {

    public static boolean check(int number) {
        boolean result = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int calc (int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check (i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(11));
        System.out.println(calc(2));
        System.out.println(calc(25));
        System.out.println(calc(49));
    }
}