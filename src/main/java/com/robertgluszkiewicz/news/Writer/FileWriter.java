package com.robertgluszkiewicz.news.Writer;

import java.io.PrintWriter;
import java.util.List;

public class FileWriter {
    private static void writeToFile(List<String> values, String fileName) {
        try (PrintWriter printWriter = new PrintWriter(fileName)) {
            for (String line : values) {
                printWriter.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
