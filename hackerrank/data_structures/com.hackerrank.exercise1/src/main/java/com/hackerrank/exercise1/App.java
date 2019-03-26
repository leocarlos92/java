package com.hackerrank.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        // Prints each sequential element in array a
        for (int i1 : a) {
            System.out.println(i1);
        }
    }
}
