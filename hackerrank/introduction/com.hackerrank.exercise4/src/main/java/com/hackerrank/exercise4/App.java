package com.hackerrank.exercise4;

import java.util.Scanner;

/**
 * HackerRank: Java Output Formatting
 *
 */
public class App 
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scanner.next();
            int x=scanner.nextInt();

            String integer = String.format("%03d", x);

            if (s1.length() < 15)
            {
                String whiteSpace = String.format("%" + (15-s1.length()) + "s", "");
                System.out.println(s1+whiteSpace+integer);
            }
            else {
                System.out.print(s1.substring(0,15)+integer);
            }
        }
        System.out.println("================================");
    }
}
