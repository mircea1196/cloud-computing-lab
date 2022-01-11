package ro.unibuc.fmi.libraryservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.unibuc.fmi.libraryservice.entity.Book;
import ro.unibuc.fmi.libraryservice.entity.Order;
import ro.unibuc.fmi.libraryservice.exceptions.BookNotFoundException;
import ro.unibuc.fmi.libraryservice.model.OrderModel;
import ro.unibuc.fmi.libraryservice.repository.BookRepository;
import ro.unibuc.fmi.libraryservice.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final OrderRepository orderRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(final Integer bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> {
            throw new BookNotFoundException("Book with given id not found!");
        });
    }

    public Order saveOrder(OrderModel orderModel) {
        return orderRepository.save(Order.builder()
                .adresa(orderModel.getAdresa())
                .name(orderModel.getName())
                .email(orderModel.getEmail())
                .telefon(orderModel.getTelefon())
                .books(extractBookIds(orderModel))
                .build());
    }

    private String extractBookIds(final OrderModel orderModel) {
        String bookIds = "";

        orderModel.getBook().forEach(book -> {
            bookIds.concat(book.getId().toString());
        });

        return bookIds;
    }
}
