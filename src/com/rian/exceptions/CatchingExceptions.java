package com.rian.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchingExceptions {
    public static void show() {
        try {
            var rader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
