/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex41;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetizeNamesTest {

    @Test
    void sortNames() throws IOException {

        AlphabetizeNames test41 = new AlphabetizeNames();

        ArrayList<String> test = new ArrayList<String>();
        test.add("Johnson, Jim");
        test.add("Jones, Aaron");
        test.add("Jones, Chris");
        test.add("Ling, Mai");
        test.add("Swift, Geoffrey");
        test.add("Xiong, Fong");
        test.add("Zarnecki, Sabrina");

        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex41/exercise41_input.txt");

        assertEquals(test, test41.sortNames(input));
    }
}