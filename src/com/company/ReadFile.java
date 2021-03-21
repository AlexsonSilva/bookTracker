package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//# Feature: Reading from file
public class ReadFile {

    public ReadFile(String fileName) {
        try {
            File myObj = new File(fileName+".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        //# Feature: Exception types
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
