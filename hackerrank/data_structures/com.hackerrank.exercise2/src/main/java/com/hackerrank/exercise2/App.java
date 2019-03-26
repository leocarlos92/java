package com.hackerrank.exercise2;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int maxSum = 6;

        for (int i = 0; i < 3; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
                if (i > 1 && j > 1)
                {
                    int sum =
                            arr[i][j]
                                    + arr[i][j-1]
                                    + arr[i][j-2]
                                    + arr[i-1][j-1]
                                    + arr[i-2][j]
                                    + arr[i-2][j-1]
                                    + arr[i-2][j-2];
                    if (sum > maxSum) {maxSum = sum;}
                }
            }
        }

        System.out.println(maxSum);

        scanner.close();
    }
}
