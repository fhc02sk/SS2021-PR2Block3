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

        long totalSize = printAndGetSize(dir);
        System.out.println("printAndGetSize(dir) = " + totalSize + " Bytes");
        System.out.println("printAndGetSize(dir) = " + totalSize / 1024.0 / 1024.0 + " MB");
    }

    public static long printAndGetSize(File dir) {

        // Abbruchbedingung?
        if (dir.isDirectory() == false) {
            return dir.length();
        }
        // else
        File[] files = dir.listFiles();
        long size = 0;

        for (File f : files) {
            System.out.println(f.getName());
            size += printAndGetSize(f); // rekursiv
        }

        return size;
    }
}
