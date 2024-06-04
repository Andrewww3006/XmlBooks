package com.company;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException {
	// write your code here

        Book book1 = new Book();
        book1.setArticule("52290");
        book1.setName("War and peace");
        book1.setDate("1912");
        List<Book> bookList = new ArrayList<>();
        book1.setBookList(bookList);



        File file = new File("xmlExample.xml");
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(book1.getBookList(),file);
        marshaller.marshal(book1.getBookList(),System.out);

    }
}
