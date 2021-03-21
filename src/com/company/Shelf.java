package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Shelf extends Book implements Library {

    private String shelfNumber;

    private ArrayList<Book> books = new ArrayList<Book>();

    private HashMap<String, String> booksAvailable = new HashMap<>();

    private HashMap<String, String> rentedBooks = new HashMap<>();

    private WriteToFile writeToFile;

    public Shelf(String shelfNumber, String title, String author, int publishedDate, String publisher, boolean isAvailable){

        this.shelfNumber = shelfNumber;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.publisher = publisher;
        this.isAvailable = isAvailable;

        CreateFile listOfBooksTXT = new CreateFile("ListOfBooks");
        writeToFile = new WriteToFile("ListOfBooks");
    }

    public String getShelfNumber(){
        return shelfNumber;
    }

    public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   void setAvailable(boolean available) {

      isAvailable = available;
   }

   public boolean isAvailable() {
      return isAvailable;
   }

    public int getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(int publishedDate) {
        this.publishedDate = publishedDate;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return ("Title: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nPublished Date: " + publishedDate +
                "\nPublisher: " + publisher);
    }

//    @Override
//    public HashMap<String, String> getBooksAvailable() {
//        HashMap<String, String> booksAvailable = new HashMap<>();
//
//        for (Book book :  getListOfBooks()){
//            if (book.isAvailable() == true)
//                booksAvailable.put(book.getTitle(), book.getAuthor());
//        }
//        this.booksAvailable = booksAvailable;
//        return booksAvailable;
//    }
//
//    @Override
//    public HashMap<String, String> getBooksRented() {
//        HashMap<String, String> rentedBooks = new HashMap<>();
//
//        for (Book book :  getListOfBooks()){
//            if (book.isAvailable() == false)
//                rentedBooks.put(book.getTitle(), book.getAuthor());
//        }
//        this.rentedBooks = rentedBooks;
//        return rentedBooks;
//    }

    @Override
    public ArrayList<Book> getListOfBooks() {
       return books;
    }

    @Override
    public void addBookShelf(Book bk) {
        getListOfBooks().add(bk);
        writeToFile = new WriteToFile(bk, "ListOfBooks");
    }

    void printBooks(){
        System.out.println("Shelf: " + getShelfNumber());
        System.out.println("");
        for (Book book : getListOfBooks()){
            System.out.println(book.toString() + "\n");
            System.out.println("-----------------------");
        }
    }
}
