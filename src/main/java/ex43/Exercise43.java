/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex43;

import java.io.IOException;
import java.util.*;

public class Exercise43 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Site name: ");
        String name = input.nextLine();
        System.out.print("Author: ");
        String author = input.nextLine();
        System.out.print("Do you want a folder for Java Script? (y/s) ");
        String js = input.nextLine();
        System.out.print("Do you want a folder for CSS? (y/s) ");
        String css = input.nextLine();

        WebsiteGenerator wg = new WebsiteGenerator();
        String dir = wg.directory(name);
        System.out.println(dir);
        String ind = wg.indexFile(name, author);
        System.out.println(ind);

        if (js.equals("y")) {
            String jsFolder = wg.jsFolder(name);
            System.out.println(jsFolder);
        }

        if (css.equals("y")) {
            String cssFolder = wg.cssFolder(name);
            System.out.println(cssFolder);
        }



    }
}
