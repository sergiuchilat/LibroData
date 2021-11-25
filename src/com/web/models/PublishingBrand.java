package com.web.models;

import java.util.List;

public class PublishingBrand {
    public int ID;
    public String name;
    public List<Book> books;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "PublishingBrand{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
