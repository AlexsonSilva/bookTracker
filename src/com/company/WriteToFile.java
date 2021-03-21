package com.company;

import java.io.*;

public class WriteToFile {

    //# Feature: Writing to a file
    public WriteToFile(String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName+".txt");
            myWriter.write(fileName+": \n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        //# Feature: Exception
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public WriteToFile(Book b, String fileName) {

        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".txt", true)));) {
            String data = "\n" + b.toString();
            File file = new File(fileName+".txt");
            out.println(data);
        } catch(IOException e) {
        }
    }
}
