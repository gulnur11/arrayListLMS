package service.serviceImpl;

import database.Database;
import models.Book;
import models.Library;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public Book saveBook(Long libraryId, Book book) {
        Library library = new LibraryServiceImpl().getLibraryById(libraryId);
        if (library != null) {
            library.getBooks().add(book);
            Database.books.add(book);
            return book;
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        Library library = new LibraryServiceImpl().getLibraryById(libraryId);
        return library != null ? library.getBooks() : new ArrayList<>();
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        return getAllBooks(libraryId).stream()
                .filter(book -> book.getId().equals(bookId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        Book book = getBookById(libraryId, bookId);
        if (book != null) {
            Database.books.remove(book);
            return "Book deleted successfully.";
        }
        return "Book not found.";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        Library library = new LibraryServiceImpl().getLibraryById(libraryId);
        if (library != null) {
            library.getBooks().clear();
        }
    }


}
