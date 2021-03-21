package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public interface Library {
//    HashMap<String, String> getBooksAvailable();

//    HashMap<String, String> getBooksRented();

    ArrayList<Book> getListOfBooks();

    void addBookShelf(Book bk);



}
