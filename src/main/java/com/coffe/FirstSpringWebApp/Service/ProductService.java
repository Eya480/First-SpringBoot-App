package com.coffe.FirstSpringWebApp.Service;

import com.coffe.FirstSpringWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products= Arrays.asList(new Product(11,"Livre",50000),new Product(12,"Cahier",20000),new Product(13,"Stylo",2211));
    public List<Product> getProducts(){
        return products;
    }
}
