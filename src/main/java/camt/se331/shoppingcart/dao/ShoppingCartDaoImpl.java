package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.ShoppingCart;
import camt.se331.shoppingcart.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Shine on 3/27/2016.
 */
@Repository
public class ShoppingCartDaoImpl implements ShoppingCartDao {
        @Autowired
        ShoppingCartRepository shoppingCartRepository;

                @Override
        public ShoppingCart findById(Long id) {
                return shoppingCartRepository.findOne(id);
            }

                @Override
        public List<ShoppingCart> getShoppingCarts() {
                return null;
            }

                @Override
        public List<ShoppingCart> getShoppingCartBefore(Date stateDate) {
                return null;
            }

                @Override
        public List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate) {
                return null;
            }

                @Override
        public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
                return shoppingCartRepository.save(shoppingCart);
            }

                @Override
        public ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart) {
                return null;
            }
}

