import enums.Genre;
import models.Book;
import models.Library;
import service.BookService;
import service.LibraryService;
import service.ReaderService;
import service.serviceImpl.BookServiceImpl;
import service.serviceImpl.LibraryServiceImpl;
import service.serviceImpl.ReaderServiceImpl;

import java.util.Scanner;

import static database.Database.libraries;


public class Main {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryServiceImpl();
        BookService bookService = new BookServiceImpl();
        ReaderService readerService = new ReaderServiceImpl();


        while (true) {
            System.out.println("Choose an option:");
            System.out.print("1. Save Library   ");
            System.out.print("2. Get All Libraries   ");
            System.out.print("3. Get Library By ID   ");
            System.out.print("4. Update Library   ");
            System.out.println("5. Delete Library");
            System.out.print("6.Save Book   ");
            System.out.print("7. Get All Books   ");
            System.out.print("8.Delete Book   ");
            System.out.print("9. Get All Readers   ");


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:  System.out.println( libraryService.saveLibrary(libraries));
            break;
            case 2:
                System.out.println(libraryService.getAllLibraries());
                break;
            case 3:
                System.out.println((libraryService.getLibraryById(1L)));
                break;
            case 4:
                System.out.println(libraryService.updateLibrary(1L, new Library(1L, "Updated Library",
                        "456 Elm St")));
                break;
            case 5:
                System.out.println(libraryService.deleteLibrary(1L));break;
            case 6:
                System.out.println(bookService.saveBook(1L, new Book(1L, "Java Programming",
                        "Author X", Genre.SCIENCE)));
                break;
            case 7:
                System.out.println(bookService.getAllBooks(1L)); break;
            case 8:
                System.out.println(bookService.deleteBook(1L, 1L));break;
            case 9:
                System.out.println(readerService.getAllReaders());break;
            default:
                System.out.println("Not found!");

        }}


















    }

}