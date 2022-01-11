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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(generator = "ORDER_SEQ_GEN", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ORDER_SEQ_GEN", sequenceName = "order_seq", allocationSize = 1)
    private Integer id;

    private String name;

    private String adresa;

    private String telefon;

    private String email;

    private String books;



}
