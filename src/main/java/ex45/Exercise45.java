/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex45;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Exercise45 {
    public static void main(String[] args) throws IOException {
        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex45/exercise45_input.txt");
        Scanner in = new Scanner(input);
        Scanner filename = new Scanner(System.in);


        ArrayList<String> arr = new ArrayList<String>();

        while (in.hasNext()) {
            arr.add(in.next());
        }


        Replace ptr = new Replace();
        String result = ptr.replaceUtilize(arr);

        System.out.print("What would you like the file name to be? ");
        String name = filename.nextLine();
        FileWriter f_output = new FileWriter(name);

        f_output.write(result);
        f_output.flush();
        f_output.close();
    }




}
