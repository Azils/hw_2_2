package com.company;

public class Book_liter extends Newspaper {

    private int page;

    public Book_liter(String name, int publishingDate, int page) {
        super(name, publishingDate);
        this.page = page;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", " + "Date: " + getPublishingDate() + ", " + page);
    }
}

