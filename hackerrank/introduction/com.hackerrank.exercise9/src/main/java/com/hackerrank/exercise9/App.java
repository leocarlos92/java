package com.hackerrank.exercise9;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{

    private static boolean flag = true;
    private static int B;
    private static int H;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        scan.nextLine();
        H = scan.nextInt();
        scan.close();
        if(B>=0 && H>=0) {
            flag = true;
        }
        if((B<=0 && H>=0)||(B>=0 && H<=0) || (B<=0 && H<=0)){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
