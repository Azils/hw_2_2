package com.company;

public class Book extends Newspaper {
    private String author;

    public Book(String name, int publishingDate, String author) {
        super(name, publishingDate);
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", " + "Date: " + getPublishingDate()+", " + author);
    }
}
