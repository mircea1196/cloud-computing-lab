package ro.unibuc.fmi.orderservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.unibuc.fmi.orderservice.model.BasketModel;
import ro.unibuc.fmi.orderservice.model.BookModel;
import ro.unibuc.fmi.orderservice.repository.BasketRepository;

import java.util.*;

@Service
@AllArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;

    public BasketModel getAllBySessionId(final String sessionId) {
        return basketRepository.findById(sessionId)
                .orElse(BasketModel.builder()
                        .id(sessionId)
                        .bookList(Collections.emptyList())
                        .build());
    }

    public BasketModel saveBookInBasket(final String sessionId, final BookModel bookModel) {
        List<BookModel> books = new ArrayList<>();
        Optional<BasketModel> basketModel = basketRepository.findById(sessionId);
        if (basketModel.isPresent()) {
            books = basketModel.get().getBookList();
        }

        books.add(bookModel);
        return basketRepository.save(BasketModel.builder()
                .id(sessionId)
                .bookList(books)
                .build());
    }

    public void deleteBySessionId(String id) {
        basketRepository.deleteById(id);
    }
}
