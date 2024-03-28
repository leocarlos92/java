package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int N;
        N = 1041;
        System.out.println(solution(N));
        N = 9; // number 9 has binary representation 1001 and contains a binary gap of length 2
        System.out.println(solution(N));
        N = 529; // number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
        System.out.println(solution(N));
        N = 20; // number 20 has binary representation 10100 and contains one binary gap of length 1
        System.out.println(solution(N));
        N = 15; // number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        // given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
        String binary = Integer.toBinaryString(N);
        int countZeros = 0;
        int StrongGapZeros = 0;

        for (int binaryNumber = 0; binaryNumber < binary.length(); binaryNumber++) {
            if (binary.charAt(binaryNumber) == '1') {
                StrongGapZeros = Math.max(StrongGapZeros, countZeros);
                countZeros = 0;
            }
            if (binary.charAt(binaryNumber) == '0') {
                countZeros++;
            }
        }
        return StrongGapZeros;
    }
}