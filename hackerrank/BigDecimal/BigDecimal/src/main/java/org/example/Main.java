package org.example;

/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers.
Let's test your knowledge of them!

Given an array, , of  real number strings, sort them in descending order — but wait, there's more!
Each number must be printed in the exact same format as it was read from stdin,
meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ),
then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below.
You must rearrange array 's elements according to the instructions above.
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BigDecimal[] arr = {
                new BigDecimal("9"),
                new BigDecimal("-100"),
                new BigDecimal("50"),
                new BigDecimal("0"),
                new BigDecimal("56.6"),
                new BigDecimal("90"),
                new BigDecimal("0.12"),
                new BigDecimal(".12"),
                new BigDecimal("02.34"),
                new BigDecimal("000.000")
        };
        // sort the array in descending order
        Solution(arr);
    }

    public static void Solution(BigDecimal[] arr) {
        //sort array
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static BigDecimal[] sortArray(BigDecimal[] arr) {
        Arrays.sort(arr, Comparator.reverseOrder());
        return arr;
    }
}