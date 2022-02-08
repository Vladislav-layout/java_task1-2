package com.max.idea;

import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 + 1) - 10);
        }
        int max_negative = -10;
        int min_positive = 10;

        for (int j : array) {
            if (j < 0 && j > max_negative) {
                max_negative = j;
            }
            if (j > 0 && j < min_positive) {
                min_positive = j;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("максимальный отрицательный: " + max_negative + "\nминимальный положительный: " + min_positive);
    }
}