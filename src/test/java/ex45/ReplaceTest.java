/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {

    @Test
    void replaceUtilize() throws FileNotFoundException {
        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex45/exercise45_input.txt");
        Scanner in = new Scanner(input);

        ArrayList<String> arr = new ArrayList<String>();

        while (in.hasNext()) {
            arr.add(in.next());
        }
        String expectation = "One should never use the word \"use\" in writing. Use \"use\" instead. For example, \"She uses an IDE to write her Java programs\" instead of \"She uses an IDE to write her Java programs\". ";

        Replace test = new Replace();

        assertEquals(expectation, test.replaceUtilize(arr));
    }
}