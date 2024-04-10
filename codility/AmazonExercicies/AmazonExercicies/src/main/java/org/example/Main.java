package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] A = {10, 2, 3, 1, 20};
        // 10, 2, 3, 1, 20
        // 10, 2, 1, 3, 20
        // 10, 1, 2, 3, 20
        // 1, 10, 2, 3, 20
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map = findMinValue(A, i);
        }

        while (true){
            map.entrySet().
        }


        return 0;
    }

    public static HashMap<Integer, Integer> findMinValue(int A[], int start) {
        int min = 0;
        for (int i = start; i < A.length; i++) {
            if (A[i] < min) {
                return new HashMap<>(i, A[i]);
            }
        }
        return new HashMap<>();
    }
}