package com.rian.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (IOException e) {
            System.out.println("Cloud not read data.");
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
