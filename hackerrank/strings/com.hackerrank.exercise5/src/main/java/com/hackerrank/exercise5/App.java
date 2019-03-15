package com.hackerrank.exercise5;

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
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagramArrays(String a, String b) {

        String copyOfA = a.replaceAll("\\s", "").toLowerCase();
        String copyOfB = b.replaceAll("\\s", "").toLowerCase();

        if(copyOfA.length() != copyOfB.length())
        {
            return false;
        }
        else {
            char[] copyOfAChars = copyOfA.toCharArray();
            char[] copyOfBChars = copyOfB.toCharArray();

            Arrays.sort(copyOfAChars);
            Arrays.sort(copyOfBChars);

            String sortedA = new String(copyOfAChars);
            String sortedB = new String(copyOfBChars);

            return sortedA.equals(sortedB);
        }
    }


    private static boolean isAnagram(String a, String b){
        //Removing white spaces from s1 and s2 and changing case to lower

        String copyOfA = a.replaceAll("\\s", "").toLowerCase();

        String copyOfB = b.replaceAll("\\s", "").toLowerCase();

        //Initially setting status as true

        boolean status = true;

        if(copyOfA.length() != copyOfB.length())
        {
            //Setting status as false if copyOfA and copyOfB doesn't have same length

            status = false;
        }
        else
        {
            //Converting copyOfA to char array

            char[] s1ToArray = copyOfA.toCharArray();

            //Checking whether each character of s1ToArray is present in copyOfB

            for (char c : s1ToArray)
            {
                int index = copyOfB.indexOf(c);

                if(index != -1)
                {
                    //If character is present in copyOfB, removing that char from copyOfB

                    copyOfB = copyOfB.substring(0, index)+copyOfB.substring(index+1, copyOfB.length());
                }
                else
                {
                    //If character is not present in copyOfB, setting status as false and breaking the loop

                    status = false;

                    break;
                }
            }
        }

        //Output
        return status;
    }
}
