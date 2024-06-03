package com.company;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Book book1 = new Book();
        book1.setArticule("52290");
        book1.setName("War and peace");
        book1.setDate("1912");
        List<Book> listBook = new ArrayList<>();
            listBook.add(book1);



    }
}
