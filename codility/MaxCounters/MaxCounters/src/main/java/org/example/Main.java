package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[] counters;

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        System.out.println(Arrays.toString(solution(N, A)));
    }

    //You are given N counters
    // increase(X) − counter X is increased by 1
    // max counter − all counters are set to the maximum value of any counter
    public static int[] solution(int N, int[] A) {
        counters = new int[N];
        initiateArrayCounter(counters);
        for (int i = 0; i < A.length; i++) {
            executeOperation(A[i], N);
        }
        return counters;
    }

    public static void initiateArrayCounter(int[] counters) {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = 0;
        }
        //Arrays.fill(counters, 0);
    }

    public static void executeOperation(int number, int counters) {
        if (number > counters) {
            max_Counter();
        }
        if (number >= 1 && number <= counters) {// index >= 0 && index < array.length && value >= 1 && value <= array.length
            increase(number);
        }
    }

    public static void increase(int index) {
        index--;
        counters[index]++;
    }

    public static void max_Counter() {
        int maxValue = Arrays.stream(counters).max().getAsInt();
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] != maxValue){
                counters[i] = maxValue;
            }
        }
    }

    public static int[] solution2(int N, int[] A) {

        return null;
    }
}