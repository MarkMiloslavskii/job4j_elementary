package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i : coins) {
            while (balance >= i) {
                balance = balance - i;
                result[size] = i;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
