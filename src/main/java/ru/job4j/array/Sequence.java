package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        System.out.println(array[0][0]);

        int[][] data = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] datum : data) {
            System.out.println("Размер вложенного массива равен: " + datum.length);
        }
    }
}
