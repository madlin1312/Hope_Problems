package com.sessionmanager.service;

import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    public void saveToFile(String content, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}