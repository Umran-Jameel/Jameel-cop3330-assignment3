/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {
    String name = "awesomeco";
    String author = "Max Power";
    WebsiteGenerator test43 = new WebsiteGenerator();

    @Test
    void directory() {
        String test = "Created .website/" +name;
        assertEquals(test, test43.directory(name));
    }

    @Test
    void indexFile() throws IOException {
        String test = "Created .website/" +name+ "index.html";
        assertEquals(test, test43.indexFile(name, author));
    }

    @Test
    void jsFolder() {
        String test = "Created .website/" +name+"/js/";
        assertEquals(test, test43.jsFolder(name));
    }

    @Test
    void cssFolder() {
        String test = "Created .website/" +name+"/css/";
        assertEquals(test, test43.cssFolder(name));
    }
}