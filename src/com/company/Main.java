package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(1, "Война и Мир", "Лев Толстой", 2014, "Russia");
        Book book2 = new Book(2, "Гарри Поттер и тайная комната", "Д.Роулинг", 2019, "Russia");
        Book book3 = new Book(3, "Код Да Винчи", "д. Браун", 2013, "USA");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library = new Library(books);
        library.printBookByPublish("USA");
        System.out.println();
        library.printBookByID(2);
        System.out.println();
        library.printBookByYear(2015);

    }
}