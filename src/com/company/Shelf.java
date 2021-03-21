package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shelf extends BookStore implements Activity{

    private String shelfNumber;

    //# Feature: ArrayList
    private ArrayList<Book> books = new ArrayList<Book>();

    //# Feature: HashMap
    private HashMap<String, String> booksAvailable = new HashMap<>();

    //# Feature: HashMap
    private HashMap<String, String> rentedBooks = new HashMap<>();

    private WriteToFile writeToFile;

    public Shelf(String shelfNumber, String name, String address){
        super(name, address);
        this.shelfNumber = shelfNumber;

        CreateFile listOfBooksTXT = new CreateFile("ListOfBooks");
        writeToFile = new WriteToFile("ListOfBooks");
    }

    public String getShelfNumber(){
        return shelfNumber;
    }

    //# Feature: Overriding
    @Override
    public void addBookShelf(Book bk) {
        getListOfBooks().add(bk);
        writeToFile = new WriteToFile(bk, "ListOfBooks");
    }

    //# Feature: Overriding
    @Override
    public HashMap<String, String> getBooksAvailable() {
        HashMap<String, String> booksAvailable = new HashMap<>();

        for (Book book :  getListOfBooks()){
            if (book.isAvailable() == true)
                booksAvailable.put(book.getTitle(), book.getAuthor());
        }
        this.booksAvailable = booksAvailable;
        return booksAvailable;
    }

    //# Feature: Overriding
    @Override
    public HashMap<String, String> getBooksRented() {
        HashMap<String, String> rentedBooks = new HashMap<>();

        for (Book book :  getListOfBooks()){
            if (book.isAvailable() == false)
                rentedBooks.put(book.getTitle(), book.getAuthor());
        }
        this.rentedBooks = rentedBooks;
        return rentedBooks;
    }

    //# Feature: Overriding
    @Override
    public ArrayList<Book> getListOfBooks() {
        return books;
    }

    void printBooks(){
        System.out.println("Book Store: " + getNameBookStore() + " | " + "Shelf: " + getShelfNumber());
        System.out.println("");
        for (Book book : getListOfBooks()){
            System.out.println(book.toString() + "\n");
            System.out.println("-----------------------");
        }
    }

    void printBooksRented(){

        HashMap<String, String> booksRented = getBooksRented();

        System.out.println("Rented Books:\n");

        for (Map.Entry<String, String> book: booksRented.entrySet()){
            System.out.println("Book: "+book.getKey() + "\n" + "Author: " + book.getValue());
            System.out.println("--------------------");
        }
    }

    void printBooksAvailable(){

        HashMap<String, String> booksAvailable = getBooksAvailable();

        System.out.println("Available Books:\n");

        for (Map.Entry<String, String> book: booksAvailable.entrySet()){
            System.out.println("Book: "+book.getKey() + "\n" + "Author: " + book.getValue());
            System.out.println("--------------------");
        }
    }
}
