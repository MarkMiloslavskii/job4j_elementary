package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
         int i = indexOf(new int[] {5, 10, 3}, 5);
         System.out.println(i);
        int j = indexOf(new int[] {5, 12, 3}, 10);
         System.out.println(j);
        int k = indexOf(new int[] {3, 2, 1}, 1);
        System.out.println(k);
    }
}