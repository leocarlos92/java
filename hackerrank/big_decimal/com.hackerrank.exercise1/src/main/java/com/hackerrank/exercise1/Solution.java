package com.hackerrank.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Solution{
    public void function(){
        File file = new File("/home/leonarbc/IdeaProjects/personal_repo/java/hackerrank/big_decimal/exercises/com.hackerrank.exercise1/java-bigdecimal-testcases/input");


        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scanner != null) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
            }
        }

    }
}
