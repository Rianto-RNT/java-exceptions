package com.rian.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;

public class ExceptionDemo {
    public static void show() {
        sayHello(null);

    }
    public static void sayHello(String name) {
        try {
            var rader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
