package com.web.models;

import com.web.interfaces.IPublishingArtifact;

import java.util.List;

public class EditorialGroup implements IPublishingArtifact {
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
                "<editorialGroup> <ID>editorialGroupIDEditorialGroup1</ID> <Name>editorialGroupName EditorialGroup1</Name>\n" +
                "    </editorialGroup>\n" +
                "    <books>\n" +
                "<book> <title>NameBook1EditorialGroup1</title>\n" +
                "<subtitle>SubtitleBook1EditorialGroup1</subtitle> <isbn>isbnBook1EditorialGroup1</isbn> <pageCount>pageCountBook1EditorialGroup1</pageCount> <keywords>keywordsBook1EditorialGroup1</keywords> <languageID>languageIDBook1EditorialGroup1</languageID> <createdOn>createdOnBook1EditorialGroup1<createdOn> <authors>authorsBook1EditorialGroup1<authors>\n" +
                "</book>\n" +
                "<!-- Alte cărți pentru acest editorial group -->\n" +
                "</books>\n" +
                "</xml>";
    }
}
