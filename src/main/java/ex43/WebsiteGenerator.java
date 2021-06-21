/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex43;

import java.io.*;

public class WebsiteGenerator {
    public String directory(String name) {
        File result = new File("/Users/umranrazack02/IdeaProjects/assignment3/website/" +name + "/");
        result.mkdirs();
        return "Created .website/" +name;
    }

    public String indexFile(String name, String author) throws IOException {
        File result = new File("/Users/umranrazack02/IdeaProjects/assignment3/website/" +name + "index.html");

        BufferedWriter bw = new BufferedWriter(new FileWriter(result));
        bw.write("<html><title>"+name+"</title>\n<meta> name = \"author\" content = \""+author+"\"</meta>\n</html>");
        bw.close();

        return "Created .website/" +name+ "index.html";
    }

    public String jsFolder(String name) {
        File result = new File("/Users/umranrazack02/IdeaProjects/assignment3/website/" +name + "/js/");
        result.mkdirs();
        return "Created .website/" +name+"/js/";
    }

    public String cssFolder(String name) {
        File result = new File("/Users/umranrazack02/IdeaProjects/assignment3/website/" +name + "/css/");
        result.mkdirs();
        return "Created .website/" +name+"/css/";
    }
}
