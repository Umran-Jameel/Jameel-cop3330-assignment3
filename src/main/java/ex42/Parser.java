/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex42;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Parser {
    public ArrayList<String> salaries(File input) throws FileNotFoundException {
        ArrayList<String> ret = new ArrayList<String>();
        Scanner read = new Scanner(input);

        while(read.hasNextLine()) {
            List<Character> temp = new ArrayList<Character>();
            char[] tempArr = new char[30];

            tempArr = read.nextLine().toCharArray();

            for (int i = 0; i < tempArr.length; i++) {
                if (Character.isDigit(tempArr[i])) {
                    temp.add(tempArr[i]);
                }
            }

            StringBuilder build = new StringBuilder();

            for (int i = 0; i < temp.size(); i++) {
                build.append(temp.get(i));
            }

            ret.add(build.toString());
        }

        return ret;
    }

    public ArrayList<String> firstNames(File input) throws FileNotFoundException {
        ArrayList<String> ret = new ArrayList<String>();
        Scanner read = new Scanner(input);

        while(read.hasNextLine()) {
            List<Character> temp = new ArrayList<Character>();
            char[] tempArr = new char[30];

            tempArr = read.nextLine().toCharArray();

            for (int i = 0; i < tempArr.length; i++) {
                if (tempArr[i] == ',') {
                    for (int j = i + 1; j < tempArr.length; j++) {
                        if (tempArr[j] == ',') break;
                        else
                            temp.add(tempArr[j]);
                    }
                }
                else
                    continue;

                break;
            }

            StringBuilder build = new StringBuilder();

            for (int i = 0; i < temp.size(); i++) {
                build.append(temp.get(i));
            }
            ret.add(build.toString());
        }

        return ret;
    }

    public ArrayList<String> lastNames(File input) throws FileNotFoundException {
        ArrayList<String> ret = new ArrayList<String>();
        Scanner read = new Scanner(input);

        while(read.hasNextLine()) {
            List<Character> temp = new ArrayList<Character>();
            char[] tempArr = new char[30];

            tempArr = read.nextLine().toCharArray();

            for (int i = 0; i < tempArr.length; i++) {
                if (tempArr[i] == ',') {
                    break;
                }
                else
                    temp.add(tempArr[i]);
            }

            StringBuilder build = new StringBuilder();

            for (int i = 0; i < temp.size(); i++) {
                build.append(temp.get(i));
            }

            ret.add(build.toString());
        }

        return ret;
    }
}
