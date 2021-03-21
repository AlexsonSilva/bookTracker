package com.company;

import java.util.ArrayList;
import java.util.HashMap;

//# Feature: Interface
public interface Activity {
    HashMap<String, String> getBooksAvailable();

    HashMap<String, String> getBooksRented();

    ArrayList<Book> getListOfBooks();

    void addBookShelf(Book bk);



}
