package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int countNumberArray = A.length + 1;
        int SumAllNumbersArray = countNumberArray * (countNumberArray + 1) / 2;
        int sum = 0;

        for (int num : A) {
            sum += num;
        }
        return SumAllNumbersArray - sum;
    }
}