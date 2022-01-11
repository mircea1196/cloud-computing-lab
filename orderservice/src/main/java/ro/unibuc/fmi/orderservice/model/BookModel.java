package ro.unibuc.fmi.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookModel implements Serializable {

    private Integer id;
    private Author author;
    private Category category;
    private String name;
    private Double salePrice;
    private Integer stock;
    private String imageUrl;
}
