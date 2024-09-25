package ru.job4j.condition;

public class Rectangle {

    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double result = diagonal(3, 4);
        double result1 = diagonal(5, 12);
        double result2 = diagonal(7, 24);
        double result3 = diagonal(1, 2);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);
        System.out.println("Diagonal of rectangle with length 5 and width 12 is " + result1);
        System.out.println("Diagonal of rectangle with length 7 and width 24 is " + result2);
        System.out.println("Diagonal of rectangle with length 1 and width 2 is " + result3);
    }
}
