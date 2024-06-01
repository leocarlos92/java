package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {2, 1, 1, 2, 3, 1};
        System.out.println(Solution(array));
        int[] array1 = {2, 1, 2, 3, 3};
        System.out.println(Solution(array1));
    }

    public static int Solution(int[] array) {
        int distinct = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (distinct != array[i]) {
                distinct = array[i];
            }
        }
        return distinct;
    }
}