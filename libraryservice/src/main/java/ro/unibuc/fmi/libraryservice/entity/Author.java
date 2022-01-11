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
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(generator = "AUTHOR_SEQ_GEN", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AUTHOR_SEQ_GEN", sequenceName = "author_seq", allocationSize = 1)
    private Integer id;
    private String name;

}
