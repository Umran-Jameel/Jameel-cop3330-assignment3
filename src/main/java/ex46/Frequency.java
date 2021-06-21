/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex46;

import java.util.ArrayList;

public class Frequency {
    public ArrayList<Integer> wordsFrequency(ArrayList<String> arr) {
        ArrayList<Integer> ret = new ArrayList<>();

        int badger = 0;
        int mushroom = 0;
        int snake = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("badger")) {
                badger++;
            }
            else if (arr.get(i).equals("mushroom")) {
                mushroom++;
            }
            else
                snake++;
        }

        ret.add(badger);
        ret.add(mushroom);
        ret.add(snake);

        return ret;
    }
}
