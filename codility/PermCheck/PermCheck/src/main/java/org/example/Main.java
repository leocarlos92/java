package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        //System.out.println(sum(A.length));
        System.out.println(solution(A));
        solution(A);

    }

    public static int solution(int[] A) {
        int arraySize = A.length;
        boolean[] visited = new boolean[arraySize + 1];

        for (int i = 0; i < arraySize; i++) {
            if (A[i] < 1 || A[i] > arraySize || visited[A[i]]) {
                return 0;
            }
            visited[A[i]] = true;
        }
        return 1;
    }
}