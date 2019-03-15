package com.hackerrank.exercise8;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }*/
        String IP = "000.12.12.034";
        System.out.println(IP.matches(new MyRegex().pattern));
    }
}
