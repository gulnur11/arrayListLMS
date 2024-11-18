package service.serviceImpl;

import database.Database;
import models.Library;
import service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {


    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        Database.libraries.addAll(libraries);
        return Database.libraries;
    }


    @Override
    public List<Library> getAllLibraries() {
        return Database.libraries;
    }


    @Override
    public Library getLibraryById(Long id) {
    for (Library library : Database.libraries) {
        if (library.getId().equals(id)) {
            return library;
        }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for(Library library1: Database.libraries){
            if (library1.getId()==id){
                library1.setName(library.getName());
                library1.setAddress(library.getAddress());
                return library1;
            }
        }
        return null;
    }



//    @Override
//     public Library updateLibrary(Long id, Library library) {
//        Library existingLibrary = getLibraryById(id);
//        if (existingLibrary != null) {
//            Database.libraries.remove(existingLibrary);
//            Database.libraries.add(library);
//            return library;
//        }
//        return null;
//    }



    @Override
    public String deleteLibrary(Long id) {
        for (Library library: Database.libraries){
            if(library.getId()==id){
                Database.libraries.remove(library);
                return "Library deleted successfully.";
            }
        }return "Library "+ id +" not found.";
    }

//    public String deleteLibrary(Long id) {
//        Library library = getLibraryById(id);
//        if (library != null) {
//            Database.libraries.remove(library);
//            return "Library deleted successfully.";
//        }
//        return "Library not found.";
//    }




}
