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
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(generator = "CATEGORY_SEQ_GEN", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CATEGORY_SEQ_GEN", sequenceName = "category_seq", allocationSize = 1)
    private Integer id;
    private String name;

}
