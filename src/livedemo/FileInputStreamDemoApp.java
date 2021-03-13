package livedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemoApp {

    public static void main(String[] args)  {

        File file = new File("D:\\temp\\demo-text.txt");
        System.out.println("file.exists() = " + file.exists());

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);

            int byteRead = 0;
            while ((byteRead = fileInputStream.read()) != -1){
                System.out.print((char)byteRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    
}
