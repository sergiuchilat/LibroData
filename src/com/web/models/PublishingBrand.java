package com.web.models;

import com.web.interfaces.IPublishingArtifact;

import java.util.List;

public class PublishingBrand implements IPublishingArtifact {
    public int ID;
    public String name;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String publish() {
        return "<xml>\n" +
                "    <publishingBrand>\n" +
                "<ID>publishingBrandIDPublishingBrand1</ID>\n" +
                "<Name>publishingBrandNamePublishingBrand1</Name> </ publishingBrand>\n" +
                "<books>\n" +
                "<book> <title>NameBook1PublishingBrand1</title>\n" +
                "<subtitle>SubtitleBook1PublishingBrand1</subtitle> <isbn>isbnBook1PublishingBrand1</isbn> <pageCount>pageCountBook1PublishingBrand1</pageCount> <keywords>keywordsBook1PublishingBrand1</keywords>\n" +
                "<languageID>languageIDBook1PublishingBrand1</languageID> <createdOn>createdOnBook1PublishingBrand1<createdOn> <authors>authorsBook1PublishingBrand1<authors>\n" +
                "</book>\n" +
                "<!-- Alte cărți pentru acest publishing brand -->\n" +
                "    </books>\n" +
                "</xml>";
    }
}
