package livedemo;

import java.io.File;

public class FileClassDemoApp {

    public static void main(String[] args) {

        // /usr/
        // D:\temp\demo-text.txt
        File datei = new File("D:\\temp\\demo-text.txt");

        System.out.println("datei.exists() = " + datei.exists());
        System.out.println("datei.length() = " + datei.length());
        System.out.println("datei.isDirectory() = " + datei.isDirectory());

        File dir = new File("D:\\temp\\");
        System.out.println("dir.isDirectory() = " + dir.isDirectory());
        System.out.println("dir.listFiles() = " + dir.listFiles());


        
    }

}
