package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.ShoppingCart;

import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ShoppingCartDao {
    List<ShoppingCart> getShoppingCarts();
    List<ShoppingCart> getShoppingCartBefore(Date stateDate);
    List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate);
    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart findById(Long id);
}
