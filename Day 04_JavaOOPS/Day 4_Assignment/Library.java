package com.coforge.day4assignment;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(int id) {
        System.out.println("Book Issued");
    }

    public void returnBook(int id) {
        System.out.println("Book Returned");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}