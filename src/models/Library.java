package models;

import java.util.ArrayList;
import java.util.List;

public class Library {


    private Long id;
    private String name;
    private String address;
    private List<Book> books;
    private List<Reader> readers;


    public Library(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "\nLibrary{ " +
                "ID=" + id +
                ",   name='" + name + '\'' +
                ",   address='" + address + '\'' +
                ",   books=" + books +
                ",  readers=" + readers +
                '}';
    }
}
