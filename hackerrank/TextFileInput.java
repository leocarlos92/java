package com.hackerrank.exercise11;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class TextFileInput {

    static void fromFile() throws FileNotFoundException {
//        Scanner reader = new Scanner(new File("/home/leonarbc/Desktop/java-currency-formatter-testcases/input"));
//        while (reader.hasNext()){
//            double i = reader.nextDouble();
//            App_alternative.currencyFormatter(i);
//        }

        List<String> myList = new ArrayList<String>();
        Scanner reader = new Scanner(new File("/home/leonarbc/Desktop/tag-content-extractor-testcases/input"));
        while (reader.hasNext()){
            myList.add(reader.nextLine());
        }
        int testCases = Integer.parseInt(myList.get(0));
        myList.remove(0);

        Iterator<String> crunchifyIterator = myList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }
    }
}
