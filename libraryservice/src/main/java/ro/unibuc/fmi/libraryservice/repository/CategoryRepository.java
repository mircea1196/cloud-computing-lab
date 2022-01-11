package ro.unibuc.fmi.libraryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.fmi.libraryservice.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
