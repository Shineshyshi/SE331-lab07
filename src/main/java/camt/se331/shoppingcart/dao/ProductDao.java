package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductDao {
    List<Product> getProducts();
    List<Product> getProductByName(String name);
    List<Product> getProductByDescription(String description);
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Product product);
    Product updateProduct(Product product);

    List<Product> getProductsByName(String name);
}
