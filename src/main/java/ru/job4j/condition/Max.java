package ru.job4j.condition;

public class Max {

    public int getMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public double getMax(double a, double b) {
        return (a > b) ? a : b;
    }

    public double getMax(int a, int b, int c) {
        return getMax(getMax(a, b), c);
    }

    public double getMax(double a, double b, double c) {
        return getMax(getMax(a, b), c);
    }

    public double getMax(double a, double b, double c, double d) {
        return getMax(getMax(a, b, c), d);
    }

    public static void main(String[] args) {
        Max maxFinder = new Max();
        System.out.println("Максимальное число: " + maxFinder.getMax(1, 2, 3));
        System.out.println("Максимальное число: " + maxFinder.getMax(1, 2));
        System.out.println("Максимальное число: " + maxFinder.getMax(0, 2.7, 3.5, 1));
        System.out.println("Максимальное число: " + maxFinder.getMax(4, 2.7));
    }
}

