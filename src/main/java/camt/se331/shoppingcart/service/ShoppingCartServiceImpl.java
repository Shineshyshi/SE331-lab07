package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.ShoppingCartDao;
import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Shine on 3/27/2016.
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    ShoppingCartDao shoppingCartDao;

                @Override
        @Transactional
        public ShoppingCart findById(Long id) {
                return shoppingCartDao.findById(id);
           }

                @Override
        public List<ShoppingCart> getShoppingCarts() {
                return null;
            }

                @Override
        public List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate) {
                return null;
            }

                @Override
        public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
                return shoppingCartDao.addShoppingCart(shoppingCart);
            }

                @Override
        public ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart) {
               return null;
            }
    }

