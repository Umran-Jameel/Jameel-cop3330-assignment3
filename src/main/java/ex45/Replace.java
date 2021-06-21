/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex45;

import java.util.ArrayList;

public class Replace {
    public String replaceUtilize(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("utilize")) {
                arr.set(i, "use");
            }
            else if (arr.get(i).equals("\"utilize\"")) {
                arr.set(i, "\"use\"");
            }
            else if (arr.get(i).equals("utilizes")) {
                arr.set(i, "uses");
            }
        }

        String ret = "";
        for (int i = 0; i < arr.size(); i++) {
            ret += arr.get(i) + " ";
        }

        return ret;
    }
}
