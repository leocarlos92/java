package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        System.out.println(solution(S, P, Q));
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int start = 0;
        int end = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> min = new ArrayList<>();
        for (int i = 0, j = 0; i < P.length && j < Q.length; i++, j++) {
            for (int x = P[i]; x < Q[j]; x++) {
                if (S.charAt(x) == 'A') {
                    min.add(1);
                } else if (S.charAt(x) == 'C') {
                    min.add(2);
                } else if (S.charAt(x) == 'G') {
                    min.add(3);
                } else if (S.charAt(x) == 'T') {
                    min.add(4);
                }
            }
        }
        return null;
    }
}