/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex41;

import java.io.*;
import java.util.*;


public class Exercise41 {
    public static void main(String[] args) throws IOException {
        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex41/exercise41_input.txt");

        AlphabetizeNames ptr = new AlphabetizeNames();

        ArrayList<String> arr = new ArrayList<String>();
        arr = ptr.sortNames(input); // Reads the file and sorts the names

        FileWriter f_output = new FileWriter("exercise41_output.txt");

        String tableHeader;

        // formats and writes the data to file
        tableHeader = String.format("Total of %d names\n-----------------\n", arr.size());
        f_output.write(tableHeader);
        for (int i = 0; i < arr.size(); i++) {
            f_output.write(arr.get(i) + "\n");
        }

        f_output.flush();
        f_output.close();
    }
}
