package org.example;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Hello world!!
 */
public class App {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream(args[1]);
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }
}
