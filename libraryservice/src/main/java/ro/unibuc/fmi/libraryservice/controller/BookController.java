package ro.unibuc.fmi.libraryservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.fmi.libraryservice.entity.Book;
import ro.unibuc.fmi.libraryservice.entity.Order;
import ro.unibuc.fmi.libraryservice.model.OrderModel;
import ro.unibuc.fmi.libraryservice.service.BookService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(final HttpServletRequest httpServletRequest) {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") final Integer bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping("/saveOrder")
    public Order saveOrder(@RequestBody final OrderModel orderModel) {
        return bookService.saveOrder(orderModel);
    }

}
