package com.hackerrank.exercise2;

//  Given an integer, n , perform the following conditional actions:
//  If n is odd, print Weird
//  If n is even and in the inclusive range of 2 to 5, print Not Weird
//  If n is even and in the inclusive range of 6 to 20, print Weird
//  If n is even and greater than 20, print Not Weird
//  Complete the stub code provided in your editor to print whether or not  is weird.

import java.util.Scanner;

/**
 * HackerRank: Java If-Else
 *
 */
public class App 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 0){
            if (N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            if (N>=6 && N<=20){
                System.out.println("Weird");
            }
            if (N>20){
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
