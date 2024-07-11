package com.company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
//@XmlType(propOrder = {"articule", "date", "name"}, name = "book")
@XmlRootElement
public class Book {
    @JsonProperty("Articule")
    private String articule;
    @JsonProperty ("Name")
    private String name;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Booklist")
    private List<Book> bookList;

    Book (){}
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

    public String toString(){ return name + articule + date + bookList;}

}
