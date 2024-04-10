package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        // int[] A = {1, 2, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int numMissing = 1;
        int[] aSorted = Arrays.stream(A).sorted().toArray();
        for (int num = 0; num < aSorted.length; num++) {
            if (aSorted[num] == numMissing) {
                numMissing++;
            }
        }
        return numMissing;
    }
}