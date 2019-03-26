package com.hackerrank.exercise1;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

class TextFileInput {

    static void fromFile() throws FileNotFoundException {



        Scanner reader = new Scanner(new File("/home/leonarbc/IdeaProjects/personal_repo/java/hackerrank/big_decimal/exercises/com.hackerrank.exercise1/java-bigdecimal-testcases/input"));
        while (reader.hasNext()){

        }

//        List<String> myList = new ArrayList<String>();
//        Scanner reader = new Scanner(new File("/home/leonarbc/IdeaProjects/personal_repo/java/hackerrank/big_decimal/exercises/com.hackerrank.exercise1/java-bigdecimal-testcases/input"));
//        while (reader.hasNext()){
//            myList.add(reader.nextLine());
//        }
        int testCases = Integer.parseInt(myList.get(0));
        myList.remove(0);

        Iterator<String> crunchifyIterator = myList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());


        }
    }
}
