package ro.unibuc.fmi.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("basket")
public class BasketModel {

    private String id;
    private List<BookModel> bookList;
}
