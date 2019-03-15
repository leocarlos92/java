package com.hackerrank.exercise6;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim(); // to remove white space from leading
        String[] stringSplit = s.split("[ !,?._'@]+");
        if (s.isEmpty()){
            System.out.println("0");
        }
        else {
            if (stringSplit.length <= 400000){
                System.out.println(stringSplit.length);
                for (String string : stringSplit){
                    System.out.println(string);
                }
            }
        }
        scan.close();
    }
}

































    /*public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.equals("")){
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            ArrayList<String> arrayList = new ArrayList<String>();
            Pattern pattern = Pattern.compile("(\\w+)");
            Matcher matcher = pattern.matcher(s);
            while(matcher.find()) {
                arrayList.add(matcher.group());
            }

            ListIterator<String> iterator = arrayList.listIterator();
            System.out.println(arrayList.size());
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        scan.close();
    }
}*/
