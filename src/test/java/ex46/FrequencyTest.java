/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex46;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void wordsFrequency() throws FileNotFoundException {
        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex46/exercise46_input.txt");
        Scanner in = new Scanner(input);

        ArrayList<String> words = new ArrayList<String>();

        while (in.hasNext()) {
            words.add(in.next());
        }

        ArrayList<Integer> test = new ArrayList<Integer>();

        test.add(7);
        test.add(2);
        test.add(1);

        Frequency test46 = new Frequency();
        assertEquals(test, test46.wordsFrequency(words));
    }
}