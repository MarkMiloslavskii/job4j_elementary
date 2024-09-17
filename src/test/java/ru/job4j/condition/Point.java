package ru.job4j.condition;

public class Point {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result1 = distance(-1, -1, 1, 1);
        double result2 = distance(-2, -2, 2, 2);
        double result3 = distance(-1.5, 1.3, 1.5, 5.3);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (-1, -1) to (1, 1) " + result1);
        System.out.println("result (-2, -2) to (2, 2) " + result2);
        System.out.println("result (-1.5, 1.3) to (1.5, 5.3) " + result3);
    }
}