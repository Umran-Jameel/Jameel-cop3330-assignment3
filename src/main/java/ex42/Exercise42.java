/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex42;

import java.io.*;
import java.util.*;

public class Exercise42 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> last = new ArrayList<String>();
        ArrayList<String> first = new ArrayList<String>();
        ArrayList<String> values = new ArrayList<String>();

        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex42/exercise42_input.txt");

        Parser parse = new Parser();

        last = parse.lastNames(input);
        first = parse.firstNames(input);
        values = parse.salaries(input);

        String tableHeader = String.format("Last      First     Salary\n--------------------------\n");
        System.out.print(tableHeader);

        int index = 0;
        System.out.print(last.get(index));
        System.out.printf("      %s", first.get(index));
        System.out.printf("       %s\n", values.get(index));
        index++;
        System.out.print(last.get(index));
        System.out.printf("   %s", first.get(index));
        System.out.printf("       %s\n", values.get(index));
        index++;
        System.out.print(last.get(index));
        System.out.printf("     %s", first.get(index));
        System.out.printf("     %s\n", values.get(index));
        index++;
        System.out.print(last.get(index));
        System.out.printf("     %s", first.get(index));
        System.out.printf("     %s\n", values.get(index));
        index++;
        System.out.print(last.get(index));
        System.out.printf("     %s", first.get(index));
        System.out.printf("  %s\n", values.get(index));
        index++;
        System.out.print(last.get(index));
        System.out.printf("     %s", first.get(index));
        System.out.printf("      %s\n", values.get(index));
        index++;
        System.out.print(last.get(index));
        System.out.printf("  %s", first.get(index));
        System.out.printf("   %s\n", values.get(index));
    }
}
