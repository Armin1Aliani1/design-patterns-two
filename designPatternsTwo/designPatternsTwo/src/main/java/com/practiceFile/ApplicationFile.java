package com.practiceFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationFile {
    public static void main(String[] args) throws IOException {
//        writeOnFile();

        readAndCreateFile();

        readingEqualNames();

    }

    private static void readingEqualNames() throws FileNotFoundException {
        File file = new File("names.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                if (scanner.hasNextLine() == scanner.nextLine().contains("name:Morgan")) {
                    System.out.println(scanner.nextLine());
                }
            }
        }
    }

    private static void readAndCreateFile() throws IOException {
        File file = new File("names.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }

        Scanner scannerOne = new Scanner(file);
        if (scannerOne.hasNextLine() == scannerOne.nextLine().contains("gender:male")) {
            file = new File("maleName.txt");
            System.out.println(file.createNewFile());
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("name:JohnDoe;gender:male;age:25\n" +
                    "name:DavidJohnson;gender:male;age:17\n" +
                    "name:MorganJohnson;gender:male;age:17");
            fileWriter.close();
        } else {
            file = new File("femaleName.txt");
            System.out.println(file.createNewFile());
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("name:RoseTyson;gender:female;age:28\n" +
                    "name:MorganDoe;gender:female;age:27");
            fileWriter.close();
        }

    }

    private static void writeOnFile() throws IOException {
        File file = new File("names.txt");
        System.out.println(file.createNewFile());
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("name:JohnDoe;gender:male;age:25\n" +
                "name:DavidJohnson;gender:male;age:17\n" +
                "name:MorganJohnson;gender:male;age:17\n" +
                "name:RoseTyson;gender:female;age:28\n" +
                "name:MorganDoe;gender:female;age:27");
        fileWriter.close();
    }
}
