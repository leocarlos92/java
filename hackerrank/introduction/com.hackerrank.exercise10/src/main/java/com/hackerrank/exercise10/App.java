package com.hackerrank.exercise10;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/leonarbc/IdeaProjects/personal_repo/java/hackerrank/com.hackerrank.exercise10/input.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
