package org.example;

public class Main {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int countCars = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == 0 && A[j] == 1) {
                    //System.out.println(A[i] + "," + A[j]);
                    countCars++;
                }
                if (countCars >= 1000000000) {
                    return -1;
                }
            }
        }
        return countCars;
    }
}