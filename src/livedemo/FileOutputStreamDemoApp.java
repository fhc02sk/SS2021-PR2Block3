package livedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoApp {

    public static void main(String[] args)  {

        File file = new File("D:\\temp\\demo-output.txt");

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);

            String demoText = "Hallo, erster Fileoutput.\nZweite Zeile...";
            for (char c : demoText.toCharArray()){
                fileOutputStream.write((int)c);
            }

            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
