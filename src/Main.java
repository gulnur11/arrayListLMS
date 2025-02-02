import enums.Gender;
import enums.Genre;
import models.Book;
import models.Library;
import models.Reader;
import service.BookService;
import service.LibraryService;
import service.ReaderService;
import service.serviceImpl.BookServiceImpl;
import service.serviceImpl.LibraryServiceImpl;
import service.serviceImpl.ReaderServiceImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryServiceImpl();
        BookService bookService = new BookServiceImpl();
        ReaderService readerService = new ReaderServiceImpl();

        List<Library> libraries = new ArrayList<>();
        libraries.add(new Library(1L, "DUBLIN CITY LIBRARY", "BroadStreet21"));
        libraries.add(new Library(2L, "NEW YORK CITY LIBRARY", "WestStreet21"));
        libraryService.saveLibrary(libraries);

        Book book1 = new Book(1L, "War and Peace", "Lev Tolstoy", Genre.FICTION);
        Book book2 = new Book(2L, "Sherlock Holmes", "Arthur Doyle", Genre.DETECTIVE);
        bookService.saveBook(1L,book1);
        bookService.saveBook(2L, book2);

        Reader reader1 = new Reader(1L, "Eida Shelby", "eida@.com", "0555227755", Gender.FEMALE);
        Reader reader2 = new Reader(2L, "Thomas Shelby", "thommy@.com", "0555661100", Gender.MALE);
        readerService.saveReader(reader1);
        readerService.saveReader(reader2);


         System.out.println("Save method " + libraryService.saveLibrary(libraries));
         System.out.println("\nDelete method  " +libraryService.deleteLibrary(1L));
         System.out.println(libraryService.getAllLibraries());
        System.out.println("test");


//        try {
//        while (true) {
//            System.out.print("Choose an option:   ");
//            System.out.print("1.SaveLibrary method: ");
//            System.out.print("2.Get All Libraries   ");
//            System.out.print("3.Get Library By ID   ");
//            System.out.print("4.Update Library   ");
//            System.out.print("5.Delete Library  ");
//            System.out.print("6.Save Book1   ");
//            System.out.print("7.Save Book2  ");
//            System.out.println("8.getAllBooks in library 1:  ");
//            System.out.print("9.getAllBooks in library 2:  ");
//            System.out.print("10.GetBookByID method:  ");
//            System.out.print("11.DeleteBook method:  ");
//            System.out.print("12.Clear method ID 1  ");
//            System.out.println("13.Clear method ID 2 ");
//            System.out.print("14.getAllReaders:  ");
//            System.out.print("15.Readers getByID 1: ");
//            System.out.print("16. Readers getByID 2: ");
//            System.out.print("17.UpDate Readers method:  ");
//            System.out.print("18.assignReaderToLibrary method id 1  ");
//            System.out.println("19.assignReaderToLibrary method id 2 ");
//
//
//            Scanner scanner = new Scanner(System.in);
//            int choice = scanner.nextInt();
//            if (choice <= 0) {
//                throw new RuntimeException("Маалымат терс сан же нөл боло албайт.");
//            }
//
//            switch (choice) {
//                case 1:
//                    System.out.println("SaveLibrary method: " + libraryService.saveLibrary(libraries));
//                    break;
//                case 2:
//                    System.out.println("GetAllLibrary method: " + libraryService.getAllLibraries());
//                    break;
//                case 3:
//                    System.out.println("GetLibrary byID: " + libraryService.getLibraryById(1L));
//                    break;
//                case 4:
//                    System.out.println("UpdateLibrary method: " + libraryService.updateLibrary(2L, new Library(2L, "British library", "WestStreet21")));
//                    break;
//                case 5:
//                    System.out.println("DeleteLibrary method: " + libraryService.deleteLibrary(1L));
//                    break;
//                case 6:
//                    System.out.println("SaveBook1 method: " + bookService.saveBook(1L, book1));
//                    break;
//                case 7:
//                    System.out.println("SaveBook2 method: " + bookService.saveBook(2L, book2));
//                    break;
//                case 8:
//                    System.out.println("getAllBooks in library 1: " + bookService.getAllBooks(1L));
//                    break;
//                case 9:
//                    System.out.println("getAllBooks in library 2: " + bookService.getAllBooks(2L));
//                    break;
//                case 10:
//                    System.out.println("GetBookByID method:  " + bookService.getBookById(1L, 1L));
//                    break;
//                case 11:
//                    System.out.println("DeleteBook method:  " + bookService.deleteBook(1L,1L));
//                    break;
//                case 12:
//                    System.out.println("Clear method ID 1");
//                    bookService.clearBooksByLibraryId(1L);
//                    break;
//                case 13:
//                    System.out.println("Clear method ID 2 ");
//                    bookService.clearBooksByLibraryId(1L);
//                    break;
//                case 14:
//                    System.out.println("getAllReaders:  " + readerService.getAllReaders());
//                    break;
//                case 15:
//                    System.out.println("getByID 1: " + readerService.getReaderById(1L));
//                    break;
//                case 16:
//                    System.out.println("getByID 2: " + readerService.getReaderById(2L));
//                    break;
//                case 17:
//                    System.out.println("UpDate method:  " + readerService.updateReader(2L, new Reader(2L,
//                "Michael", "mike@.com", "0555667755", Gender.MALE)));
//                    break;
//                case 18:
//                    System.out.println("assignReaderToLibrary method id 1 ");
//                    readerService.assignReaderToLibrary(1L, 1L);
//                    System.out.println("Readers in library 1: " + libraryService.getLibraryById(1L).getReaders());
//                    break;
//                case 19:
//                    System.out.println("assignReaderToLibrary method id 2 ");
//                    readerService.assignReaderToLibrary(2L, 2L);
//                    System.out.println("Readers in library 1: " + libraryService.getLibraryById(2L).getReaders());
//                    break;
//                default:
//                    System.out.println("Мындай метод жок !");
//
//            }
//        }}
//
//        catch (InputMismatchException e){
//            System.out.println("Required numerals ");
//        }catch (RuntimeException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//

















//        System.out.println("Save book 1  " + bookService.saveBook(1L, book1));
//        System.out.println("Save book 2  " + bookService.saveBook(2L, book2));
//        System.out.println("getAllBooks in library 1: " + bookService.getAllBooks(1L));
//        System.out.println("getAllBooks in library 2: " + bookService.getAllBooks(2L));
//        System.out.println("GetBookByID method:  " + bookService.getBookById(1L, 1L));
//        System.out.println("DeleteBook method:  " + bookService.deleteBook(1L,1L));
//        System.out.println("getAllBooks in library 1 : " + bookService.getAllBooks(1L));
//        System.out.println("getAllBooks in library 2: " + bookService.getAllBooks(2L));
//        System.out.println("Clear method");
//        bookService.clearBooksByLibraryId(1L);
//        bookService.clearBooksByLibraryId(2L);
//        System.out.println("getAllBooks in library 1: " + bookService.getAllBooks(1L));
//        System.out.println("getAllBooks in library 2: " + bookService.getAllBooks(2L));
//
//
//        System.out.println("getAllReaders:  " + readerService.getAllReaders());
//        System.out.println("getByID: " + readerService.getReaderById(1L));
//        System.out.println("getByID: " + readerService.getReaderById(2L));
//
//        System.out.println("UpDate method:  " + readerService.updateReader(2L, new Reader(2L,
//                "Michael Shelby", "mike@.com", "0555667755", Gender.MALE)));
//        System.out.println("getAllReaders:  " + readerService.getAllReaders());
//
//        readerService.assignReaderToLibrary(1L, 1L);
//        readerService.assignReaderToLibrary(2L, 2L);
//        System.out.println("Readers in library 1: " + libraryService.getLibraryById(1L).getReaders());
//        System.out.println("Readers in library 2: " + libraryService.getLibraryById(2L).getReaders());
//
//        System.out.println("TEST  " + libraryService.getAllLibraries());























    }

}