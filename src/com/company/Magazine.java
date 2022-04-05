package com.company;

public class Magazine extends Newspaper {

    private String address;

    public Magazine(String name, int publishingDate, String address) {
        super(name, publishingDate);
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", " + "Date: " + getPublishingDate() + ", " +  address);
    }

}


