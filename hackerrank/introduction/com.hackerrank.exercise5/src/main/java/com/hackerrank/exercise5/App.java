package com.hackerrank.exercise5;

import java.util.Scanner;

/**
 * HackerRank: Java Loops I
 *
 */
public class App 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i=1;i<11;i++)
        {
            int result = i * N;
            System.out.println( N + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
