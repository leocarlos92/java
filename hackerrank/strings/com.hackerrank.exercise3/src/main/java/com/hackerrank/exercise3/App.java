package com.hackerrank.exercise3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if (s.substring(i,j).length() == k){
                    if ( s.substring(i,j).compareTo(smallest) < 0 ){
                        smallest = s.substring(i,j);
                    }
                    if ( s.substring(i,j).compareTo(largest) > 0 ){
                        largest = s.substring(i,j);
                    }
                }
            }
        }

        return smallest + "\n" + largest;
    }
}
