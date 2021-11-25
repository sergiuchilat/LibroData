package com.web;

import com.web.models.Author;
import com.web.models.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();

        book.setName("Amintiti din copilarie");
        book.setSubtitle("Carte de aventura");
        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author());
        authorList.add(new Author());
        authorList.add(new Author());
        book.setAuthors(authorList);

        System.out.println(book);
    }
}
