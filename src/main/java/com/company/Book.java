package com.company;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.List;

@XmlRootElement
public class Book {
    private String articule;
    private String name;
    private String date;
    private List<Book> bookList;
    public String getArticule() {
        return articule;
    }
@XmlElement
    public void setArticule(String articule) {
        this.articule = articule;
    }

    public String getName() {
        return name;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
@XmlElement
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
