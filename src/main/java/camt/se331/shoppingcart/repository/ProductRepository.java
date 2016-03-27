package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Shine on 3/25/2016.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
     List<Product> findByNameLike(String name);
     List<Product> findByNameContaining(String name);
     List<Product> findByNameContainingIgnoreCase(String name);
     List<Product> findByNameOrDescriptionContainingIgnoreCase(String name,String description);
}
