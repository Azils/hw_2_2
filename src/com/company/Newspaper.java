package com.company;

public abstract class Newspaper implements Printable{

    private String name;
    private int publishingDate;

    public Newspaper(String name, int publishingDate) {
        this.name = name;
        this.publishingDate = publishingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }
}


