package ro.unibuc.fmi.libraryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(generator = "BOOK_SEQ_GEN", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BOOK_SEQ_GEN", sequenceName = "book_seq", allocationSize = 1)
    private Integer id;
    private String name;

    private String imageUrl;

    private Integer stock;

    private Double salePrice;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

}
