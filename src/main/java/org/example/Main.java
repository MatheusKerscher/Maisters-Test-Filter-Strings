package org.example;

import java.io.IOException;
import java.util.List;

import static FilterStrings.FilterStrings.getStringsFromFile;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/my_strings.txt";

        try {
            List<String> result = getStringsFromFile(filePath);
            System.out.println("Filtered Strings: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}