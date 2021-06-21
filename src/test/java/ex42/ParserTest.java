/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex42/exercise42_input.txt");
    Parser test42 = new Parser();

    @Test
    void lastNames() throws FileNotFoundException {
        ArrayList<String> test = new ArrayList<String>();
        test.add("Ling");
        test.add("Johnson");
        test.add("Jones");
        test.add("Jones");
        test.add("Swift");
        test.add("Xiong");
        test.add("Zarnecki");

        assertEquals(test, test42.lastNames(input));
    }

    @Test
    void firstNames() throws FileNotFoundException {
        ArrayList<String> test = new ArrayList<String>();
        test.add("Mai");
        test.add("Jim");
        test.add("Aaron");
        test.add("Chris");
        test.add("Geoffrey");
        test.add("Fong");
        test.add("Sabrina");

        assertEquals(test, test42.firstNames(input));
    }

    @Test
    void salaries() throws FileNotFoundException {
        ArrayList<String> test = new ArrayList<String>();
        test.add("55900");
        test.add("56500");
        test.add("46000");
        test.add("34500");
        test.add("14200");
        test.add("65000");
        test.add("51500");

        assertEquals(test, test42.salaries(input));
    }
}