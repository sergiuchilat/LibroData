package com.web.models;

import com.web.interfaces.IPublishingArtifact;

import java.util.Date;
import java.util.List;

public class Book implements IPublishingArtifact {
    private int ID;
    private String name;
    private String subtitle;
    private String ISBN;
    private int pageCount;
    private String keywords;
    private int languageID;
    private Date createdOn;
    private List<Author> authors;

    public Book(){

    }

    public Book(String name, String ISBN){
        this.name = name;
        this.ISBN = ISBN;
    }

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String publish() {
        return "<book>\n" +
                " <title>" + this.name + "</title>" +
                "  <subtitle>SubtitleBook1</subtitle> " +
                "  <isbn>" + this.ISBN + "</isbn>" +
                "  <pageCount>pageCountBook1</pageCount>" +
                "  <keywords>keywordsBook1</keywords>" +
                "  <languageID>languageIDBook1</languageID>" +
                "  <createdOn>createdOnBook1<createdOn>\n" +
                "  <authors>authorsBook1<authors> " +
                "</book>";
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", pageCount=" + pageCount +
                ", keywords='" + keywords + '\'' +
                ", languageID=" + languageID +
                ", createdOn=" + createdOn +
                ", authors=" + authors +
                '}';
    }
}
