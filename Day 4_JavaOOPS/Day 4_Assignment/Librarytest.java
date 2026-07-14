package com.coforge.day4assignment;

public class Librarytest {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(101, "Java", "James");
        Book b2 = new Book(102, "Python", "John");
        Book b3 = new Book(103, "C++", "June");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println();

        library.displayBooks();

        System.out.println();

        library.issueBook(102);

        System.out.println();

        library.searchBook("Python");

        System.out.println();

        library.returnBook(102);

        System.out.println();

        library.displayBooks();
    }
}