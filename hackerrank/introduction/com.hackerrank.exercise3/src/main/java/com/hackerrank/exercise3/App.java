package com.hackerrank.exercise3;

import java.util.Scanner;

/**
 * HackerRank: Java Stdin and Stdout II
 *
 */
public class App 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String newLine = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
