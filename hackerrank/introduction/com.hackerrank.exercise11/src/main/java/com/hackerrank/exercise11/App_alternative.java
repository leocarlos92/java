package com.hackerrank.exercise11;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Locale;


public class App_alternative
{
    public static void main( String[] args )
    {
        try {
            TextFileInput.fromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void currencyFormatter(double payment) {
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

