package com.rian.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {

        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");

        ) {
            var value = reader.read();
        } catch (IOException e) {
            System.out.println("Cloud not read data.");
        }
    }
}
