package com.hackerrank.exercise11;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class TextFileInput {

    public void fromFile(final String fileName) throws FileNotFoundException {
        final List<String> values = new ArrayList<String>();
        final Scanner scanner = new Scanner(new File(fileName));

        final Integer num = scanner.nextInt();
        while (scanner.hasNext()){
            values.add(scanner.nextLine());
        }

        values.forEach(value ->{
            System.out.println(value);
        });
    }
}
