package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] printable = {
                createObject("1"),
                createObject("2"),
                createObject("3")};
        for (int i = 0; i < printable.length ; i++) {
            printable[i].print();
        }

    }

    public static Newspaper createObject(String className) {
        Newspaper newspaper = null;
        switch (className) {
            case "1":
                newspaper = new Book("Сынган Кылыч", 1986 , "T.Kasymbekov");
                break;
            case "2":
                newspaper = new Magazine("Раритет", 2000, "Kievskaya");
                break;
            case "3":
                newspaper = new Book_liter("Война и Мир", 1897, 400);
                break;
        }
        return newspaper;
    }
}