package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{9, 3, 9, 3, 9, 7, 9};
        int numberWithoutPair = Solution2(array);
        System.out.println(numberWithoutPair);
    }

    public static int Solution(int[] array) {
        int[] arrayNew;
        for (int i = 0; i < array.length; i++) {
            arrayNew = createArray(array, i);
            if (!findPair(arrayNew, array[i])) {
                return array[i];
            }
        }
        return 0;
    }

    public static int[] createArray(int[] array, int position) {
        int[] arrayNew = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i != position) {
                arrayNew[k] = array[i];
                k++;
            }
        }
        return arrayNew;
    }

    public static boolean findPair(int[] array, int number) {
        for (int i : array) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    public static int Solution2(int[] A) {
        // {9, 3, 9, 3, 9, 7, 7, 96, 96, 102, 9}
        int unpaired = 0;
        for (int number : A) {
            // XOR operation
            // 0 ^ 9 = 9
            // 3 ^ 9 = 10
            // 10 ^ 9 = 3
            // 3 ^ 3 = 0
            // 0 ^ 9 = 9
            // 9 ^ 7 = 14
            // 14 ^ 9 = 7
            unpaired ^= number; // unpaired XOR number
        }
        return unpaired;
    }
}