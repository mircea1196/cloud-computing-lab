package ro.unibuc.fmi.libraryservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.unibuc.fmi.libraryservice.entity.Book;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

    private String adresa;
    private String name;
    private String email;
    private String telefon;
    private List<Book> book;

}
