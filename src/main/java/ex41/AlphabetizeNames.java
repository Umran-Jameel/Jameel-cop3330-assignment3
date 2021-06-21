/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex41;

import java.io.*;
import java.util.*;


public class AlphabetizeNames {
    public ArrayList<String> sortNames(File input) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();

        Scanner read = new Scanner(input);

        // reading the contents of the file
        while (read.hasNextLine()) {
            arr.add(read.nextLine());
        }

        Collections.sort(arr);

        return arr;


    }


}
