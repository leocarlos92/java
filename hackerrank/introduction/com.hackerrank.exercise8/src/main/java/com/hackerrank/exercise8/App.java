package com.hackerrank.exercise8;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext())
        {
            String string = scanner.nextLine();
            System.out.println(count + " " + string);
            count++;
        }
    }
}
