package ro.unibuc.fmi.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.fmi.orderservice.model.BasketModel;
import ro.unibuc.fmi.orderservice.model.BookModel;
import ro.unibuc.fmi.orderservice.service.BasketService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;

    @GetMapping("/basket")
    public BasketModel getBasket(HttpServletRequest httpServletRequest) {
        return basketService.getAllBySessionId(httpServletRequest.getSession().getId());
    }

    @GetMapping("/count")
    public Integer getBasketCount(HttpServletRequest httpServletRequest) {
        return basketService.getAllBySessionId(httpServletRequest.getSession().getId()).getBookList().size();
    }

    @PostMapping("/saveBookInBasket")
    public BasketModel saveBookInBasket(@RequestBody final BookModel bookModel, final HttpServletRequest httpServletRequest) {
        BasketModel basketModel = basketService.saveBookInBasket(httpServletRequest.getSession().getId(), bookModel);
        return basketModel;
    }

    @GetMapping("/deleteBasket")
    public void deleteSession(HttpServletRequest httpServletRequest) {
        basketService.deleteBySessionId(httpServletRequest.getSession().getId());
    }

    @GetMapping("/session")
    public String getSession(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getSession().getId();
    }

}
