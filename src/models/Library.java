package models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //Library(id, name, address, List<Book>books, List<Reader>readers)

    private Long id;
    private String name;
    private String address;
    private List<Book> books;
    private List<Reader> readers;

    // Конструктор жана геттер/сеттер
    public Library(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    // Геттер жана сеттерлер
    public Long getId() {
        return id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }



}
