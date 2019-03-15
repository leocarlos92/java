package com.hackerrank.exercise1;

import org.apache.commons.lang3.text.WordUtils;

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
        String B=sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        }
        if (A.compareTo(B) < 0)
        {
            System.out.println("No");
        }

        System.out.println(WordUtils.capitalize(A) + " " + WordUtils.capitalize(B));

        String newA = A.substring(0,1).toUpperCase() + A.substring(1);
        String newB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(newA + " " + newB);

    }
}
