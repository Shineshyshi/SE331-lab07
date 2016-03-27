package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bitee on 3/27/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
