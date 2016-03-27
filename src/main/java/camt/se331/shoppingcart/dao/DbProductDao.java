package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Shine on 3/25/2016.
 */
@Repository
public class DbProductDao implements ProductDao {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByName(String name) {

        return productRepository.findByNameOrDescriptionContainingIgnoreCase(name, name);
    }

    @Override
    public List<Product> getProductByDescription(String description) {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(Product product) {
        productRepository.delete(product);
        product.setId(null);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProductsByName(String name) {
        return productRepository.findByNameOrDescriptionContainingIgnoreCase(name, name);
    }
}

