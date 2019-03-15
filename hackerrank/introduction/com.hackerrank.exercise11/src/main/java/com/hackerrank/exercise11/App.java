package com.hackerrank.exercise11;

import java.text.NumberFormat;
import java.util.Locale;
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
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        Locale localeINDIA = new Locale("en", "IN");
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(localeINDIA);
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + numberFormatUS.format(payment));
        System.out.println("India: " + numberFormatIndia.format(payment));
        System.out.println("China: " + numberFormatChina.format(payment));
        System.out.println("France: " + numberFormatFrance.format(payment));
    }
}
