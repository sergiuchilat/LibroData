package com.web;

import com.web.interfaces.IPublishingArtifact;
import com.web.models.Author;
import com.web.models.Book;
import com.web.models.PublishingRetailer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PublishingRetailer publishingRetailer = new PublishingRetailer();
        List<IPublishingArtifact> bookList = new ArrayList<>();
        for(Integer i = 1; i < 20; i++){
            bookList.add(new Book("Book" + i, i.toString()));
        }
        publishingRetailer.setPublishingArtifacts(bookList);
        System.out.println(publishingRetailer.getBooksForPublishingRetailerIDXML(1));
    }
}
