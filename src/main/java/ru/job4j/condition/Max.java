package ru.job4j.condition;

public class Max {

    public int getMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public double getMax(int a, double b) {
        return (a > b) ? a : b;
    }

    public double getMax(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public double getMax(int a, double b, double c, double d) {
        return (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) : ((b > c)
                ? ((b > d) ? b : d) : ((c > d) ? c : d));
    }

    public static void main(String[] args) {
        Max maxFinder = new Max();
        System.out.println("Максимальное число: " + maxFinder.getMax(1, 2, 3));
        System.out.println("Максимальное число: " + maxFinder.getMax(1, 2));
        System.out.println("Максимальное число: " + maxFinder.getMax(0, 2.7, 3.5, 1));
        System.out.println("Максимальное число: " + maxFinder.getMax(4, 2.7));
    }
}

