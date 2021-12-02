package com.web.models;

import com.web.interfaces.IPublishingArtifact;

import java.util.ArrayList;
import java.util.List;

public class PublishingRetailer {
    public int ID;
    public String name;
    private List<IPublishingArtifact> publishingArtifacts = new ArrayList<>();

    public void setPublishingArtifacts(List<IPublishingArtifact> publishingArtifacts) {
        this.publishingArtifacts = publishingArtifacts;
    }

    public List <Book> getBooksForPublishingRetailerID(int publishingRetailerID){

        List<Book> bookList = new ArrayList<Book>();
        publishingArtifacts.forEach(artifact -> {
            try{
                if(artifact instanceof Book){
                    bookList.add((Book) artifact);
                } else if(artifact instanceof EditorialGroup){
                    ((EditorialGroup) artifact).getBooks().forEach(book -> {
                        bookList.add(book);
                    });
                } else if(artifact instanceof PublishingBrand){
                    ((PublishingBrand) artifact).getBooks().forEach(book -> {
                        bookList.add(book);
                    });
                }
            } catch (Exception e){
                System.out.println(e);
            }

        });
        return bookList;
    }

    public String getBooksForPublishingRetailerIDXML(int publishingRetailerID){
        List<Book> bookList = this.getBooksForPublishingRetailerID(publishingRetailerID);
        final String[] booksXML = {""};
        bookList.forEach(book -> {
            booksXML[0] += book.publish();
        });
        return booksXML[0];
    }
}
