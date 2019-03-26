package com.hackerrank.exercise11;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TextFileInput {

    static void fromFile() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("/home/leonarbc/Desktop/java-currency-formatter-testcases/input"));
        while (reader.hasNext()){
            double i = reader.nextDouble();
            App_alternative.currencyFormatter(i);
        }

//        reader = new Scanner(new File("/home/leonarbc/Desktop/java-currency-formatter-testcases/input"));
//        while (reader.hasNext()){
//            String str = reader.nextLine();
//            System.out.println(str);
//        }
    }
}
