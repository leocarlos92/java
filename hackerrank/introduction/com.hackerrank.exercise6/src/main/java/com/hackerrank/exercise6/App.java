package com.hackerrank.exercise6;

import java.util.Scanner;

/**
 * HackerRank: Java Loops II
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double result = 0;
            for(int j=0;j<n;j++){
                result = result + Math.pow(2,j) * b;
                System.out.print((Math.round(a + result )+ " "));
            }
            System.out.println();
        }
        in.close();
    }
}
