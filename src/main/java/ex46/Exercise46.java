/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("/Users/umranrazack02/IdeaProjects/assignment3/src/main/java/ex46/exercise46_input.txt");
        Scanner in = new Scanner(input);

        ArrayList<String> words = new ArrayList<String>();

        while (in.hasNext()) {
            words.add(in.next());
        }


        Frequency count = new Frequency();
        ArrayList<Integer> freq = new ArrayList<Integer>();

        freq = count.wordsFrequency(words);

        ArrayList<String> different_words = new ArrayList<String>();
        different_words.add("badger");
        different_words.add("mushroom");
        different_words.add("snake");


        for (int i = 0; i < 3; i++) {
            System.out.print(different_words.get(i) + ": ");
            int j = 0;
            while (j < freq.get(i)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}
