package com.sessionmanager.main;

import com.sessionmanager.service.*;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EditorService editor = new EditorService();
        FileService fileService = new FileService();

        while (true) {
            System.out.println("\n1. Add Text");
            System.out.println("2. Add Bold");
            System.out.println("3. Add Italic");
            System.out.println("4. Add Header");
            System.out.println("5. Preview");
            System.out.println("6. Save");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.addText(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter bold text: ");
                    editor.addBold(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter italic text: ");
                    editor.addItalic(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter header text: ");
                    String text = sc.nextLine();
                    System.out.print("Enter level (1-6): ");
                    int level = sc.nextInt();
                    editor.addHeader(text, level);
                    break;

                case 5:
                    System.out.println("\nPreview:\n" + editor.preview());
                    break;

                case 6:
                    System.out.print("Enter file name: ");
                    String fileName = sc.nextLine();
                    fileService.saveToFile(editor.preview(), fileName);
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}