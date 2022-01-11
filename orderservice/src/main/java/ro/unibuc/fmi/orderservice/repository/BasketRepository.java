package ro.unibuc.fmi.orderservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.fmi.orderservice.model.BasketModel;

@Repository
public interface BasketRepository extends CrudRepository<BasketModel, String> {

}
