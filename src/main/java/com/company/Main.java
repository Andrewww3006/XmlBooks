package com.company;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Main {

    public static void main(String[] args) throws JAXBException, IOException {
	// write your code here

        Book book1 = new Book();
        book1.setArticule("52290");
        book1.setName("War and peace");
        book1.setDate("1912");

        Book book2 = new Book();
        book2.setArticule("52291");
        book2.setName("Idiot");
        book2.setDate("1915");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        Book romans = new Book();
        romans.setBookList(bookList);

for (Book x: romans.getBookList())
    System.out.println(x.getName());;

        File file = new File("xmlExample.xml");
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(romans,file);
        marshaller.marshal(romans,System.out);

        Converter converter = new Converter();
        converter.toJSON(romans);
        System.out.println(converter.toObject());



    }
}
