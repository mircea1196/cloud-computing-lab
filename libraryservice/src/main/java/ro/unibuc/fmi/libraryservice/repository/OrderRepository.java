package ro.unibuc.fmi.libraryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.fmi.libraryservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
