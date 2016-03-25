package camt.se331.shoppingcart.config;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.hsqldb.lib.ArraySort;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * Created by Shine on 25/3/2559.
 */
public class DatabaseInitializationBean implements InitializingBean {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void afterPropertiesSet() throws Exception{
        Product[] initProduct =  {
                new Product(1l,"Kindle","the good book reader",6900.00),
                new Product(2l,"Surface Pro","The unknow computer",34000.00),
                new Product(3l,"Mac pro"," Mac book interim",44000.00),
                new Product(4l,"Candle","use for lightenup the world",10.00),
                new Product(5l,"Bin","User for what ?",200.00),
                new Product(6l,"Telephone", "Call the others",150.00),
                new Product(7l,"iPhone","What is it?",26000.00),
                new Product(8l,"Galaxy Note 4","Who still use this ?",24000.00),
                new Product(9l,"AngularJS","we hate it",2000.00),
                new Product(10l,"Mazda 3","Very handsome guy use this",300000.00)
        };
        productRepository.save(Arrays.asList(initProduct));
        productRepository.save(new Product(1l,"Kindle","the good book reader",6900.00));
    }
}
