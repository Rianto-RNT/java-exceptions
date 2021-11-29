package com.rian.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("Cloud not read data.");
        }
    }

}
