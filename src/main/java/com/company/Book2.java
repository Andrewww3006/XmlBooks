package com.company;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

public class Book2 {
    @JsonProperty ("Articule")
    private String articule;
    @JsonProperty ("Name")
    private String name;
    @JsonProperty("Date")
    private String date;
    private List<Book> bookList;

    public Book2(){}

    public String getArticule() {
        return articule;
    }
    public void setArticule(String articule) {
        this.articule = articule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList){
        this.bookList = bookList;
    }

}
