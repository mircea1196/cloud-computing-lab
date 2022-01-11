package ro.unibuc.fmi.libraryservice.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(final String message) {
        super(message);
    }
}
