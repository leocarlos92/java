package com.hackerrank.exercise7;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String stringPattern = in.nextLine();
            try {
                Pattern pattern = Pattern.compile(stringPattern);
                System.out.println("Valid");

            }catch (PatternSyntaxException ex){
                System.out.println("Invalid");
            }
        }
    }
}
