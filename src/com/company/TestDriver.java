package com.company;

import java.util.HashMap;

public class TestDriver {

    public static void Run() {

        testBook();

    }

    private static void testBook() {

//        Shelf shelf = new Shelf("sh1");
//
//        Book b1 = new Book("The little prince", "Antoine de Saint-Exupery", 1943, "Reynal & Hitchcock");
//        Book b2 = new Book("Don Quixote", "Miguel de Cervantes", 1605, "Francisco de Robles");
//        Book b3 = new Book("The little Mermaid", "Hans Christian Andersen", 1837, "C. A. Reitzel");
//        Book b4 = new Book("One Hundred Yeats of Solitude", "Gabriel Garcia Márquez", 1967, "Harper & Row");
//
//
//        b1.setAvailable(false);
//        b2.setAvailable(true);
//        b3.setAvailable(true);
//        b4.setAvailable(false);

//        shelf.addBookShelf(b1);
//        shelf.addBookShelf(b2);
//        shelf.addBookShelf(b3);
//        shelf.addBookShelf(b4);
//
//        shelf.printBooks();

        Shelf b1 = new Shelf("sh1", "The little prince", "Antoine de Saint-Exupery", 1943, "Reynal & Hitchcock", false);
        Shelf b2 = new Shelf("sh2","Don Quixote", "Miguel de Cervantes", 1605, "Francisco de Robles", true);
        Shelf b3 = new Shelf("sh3","The little Mermaid", "Hans Christian Andersen", 1837, "C. A. Reitzel", true);
        Shelf b4 = new Shelf("sh4","One Hundred Yeats of Solitude", "Gabriel Garcia Márquez", 1967, "Harper & Row", false);

        b1.addBookShelf(b1);
        b2.addBookShelf(b2);
        b3.addBookShelf(b3);
        b4.addBookShelf(b4);

        b1.printBooks();
        b2.printBooks();
        b3.printBooks();
        b4.printBooks();

    }


}