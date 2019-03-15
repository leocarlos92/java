package com.hackerrank.exercise4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String aReversed = new StringBuilder(A).reverse().toString();
        if ( A.equals(aReversed) ){
            System.out.println("Yes");
        }
        if ( !A.equals(aReversed) ){
            System.out.println("No");
        }
    }
}
