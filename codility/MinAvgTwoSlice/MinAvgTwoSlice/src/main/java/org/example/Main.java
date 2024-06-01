package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
        System.out.println(solution2(new int[]{5, 6, 3, 4, 9}));
    }

    public static int solution(int[] A) {
        int average = Integer.MAX_VALUE;
        int averageAux = 0;
        int minIndex = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (j - i > 0) {
                    averageAux = slice(A, i, j);
                    if (averageAux <= average) {
                        average = averageAux;
                        minIndex = i;
                    }
                }
            }
        }
        return minIndex;
    }

    public static int slice(int[] array, int P, int Q) {
        int[] subArray = Arrays.copyOfRange(array, P, Q);
        int sum = 0;
        for (int i = 0; i < subArray.length; i++) {
            sum = sum + subArray[i];
        }
        return sum / subArray.length;
    }

    public static int solution2(int[] A) {
        int N = A.length;

        // Edge case when N < 3, handle manually
        if (N < 3) {
            return 0; // Return the only possible start, as N=2 directly means a slice of full array
        }

        // Variables to keep track of the minimum average and its first index
        double minAverage = Double.MAX_VALUE;
        int minIndex = 0;

        // Check all slices of length 2 and 3
        for (int i = 0; i < N - 1; i++) {
            // Check slice of length 2
            if (i + 1 < N) {
                double average2 = (A[i] + A[i + 1]) / 2.0;
                if (average2 < minAverage) {
                    minAverage = average2;
                    minIndex = i;
                }
            }

            // Check slice of length 3
            if (i + 2 < N) {
                double average3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                if (average3 < minAverage) {
                    minAverage = average3;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}