package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6, 19, 51};
        int K = 10;
        int[] result = rotateArray(A, K);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rotateArray(int[] A, int K) {
        if (A == null || A.length == 0 || K % A.length == 0) {
            return A;
        }

        int N = A.length;

        K = K % N;

        // Reverse the entire array
        reverse(A, 0, N - 1);

        // Reverse the first K elements
        reverse(A, 0, K - 1);

        // Reverse the remaining elements
        reverse(A, K, N - 1);

        return A;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}