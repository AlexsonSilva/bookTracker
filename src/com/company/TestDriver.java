package com.company;

import java.util.HashMap;

public class TestDriver {

    public static void Run() {



        Shelf shelf = new Shelf("Sh1", "Chapter", "O'Connell Street");

        Book b1 = new Book("The little prince", "Antoine de Saint-Exupery", 1943, "Reynal & Hitchcock");
        Book b2 = new Book("Don Quixote", "Miguel de Cervantes", 1605, "Francisco de Robles");
        Book b3 = new Book("The little Mermaid", "Hans Christian Andersen", 1837, "C. A. Reitzel");
        Book b4 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Márquez", 1967, "Harper & Row");

        b1.setAvailable(false);
        b2.setAvailable(true);
        b3.setAvailable(true);
        b4.setAvailable(false);

        shelf.addBookShelf(b1);
        shelf.addBookShelf(b2);
        shelf.addBookShelf(b3);
        shelf.addBookShelf(b4);

        shelf.printBooks();

        shelf.printSoldBooks();

        shelf.printBooksAvailable();

    }
}