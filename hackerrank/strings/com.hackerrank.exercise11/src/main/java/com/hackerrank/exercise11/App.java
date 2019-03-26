package com.hackerrank.exercise11;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {

        /*Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String regex = "<(.+)>" +   // matches any character (except for line terminators), Matches between one and unlimited times, as many times as possible, giving back as needed
                    "([^<]+)" +         // matches all the text in between the HTML start and end tags. We place a special restriction on the text in that it can't have the "<" symbol. The characters inside the parenthesis are saved into Group #2.

    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties> "</\\1>";           // match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1.
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            boolean matchFound = false;
            while (matcher.find()){
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
            testCases--;
        }
    }*/
        final TextFileInput textFileInput = new TextFileInput();
        textFileInput.fromFile("/home/leonarbc/IdeaProjects/personal_repo/java/hackerrank/big_decimal/exercises/com.hackerrank.exercise1/java-bigdecimal-testcases/input");

    }
}

