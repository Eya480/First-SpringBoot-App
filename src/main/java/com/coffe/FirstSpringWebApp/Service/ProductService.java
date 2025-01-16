package com.coffe.FirstSpringWebApp.Service;

import com.coffe.FirstSpringWebApp.Model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
public class ProductService {
    List<Product> products= new ArrayList<>(Arrays.asList(new Product(11,"Livre",50000),new Product(12,"Cahier",20000),new Product(13,"Stylo",2211)));

    public void addProduct(Product p){
        products.add(p);
    }
    public Product getProductById(int id){
        return products.stream()
                .filter(
                        (p->p.getProdId() == id)
                ).findFirst().orElse(new Product(221,"Not Found",0));
    }
    public void updateProduct(Product p) {
        if (p == null || products == null) {
            throw new IllegalArgumentException("Product or products list cannot be null.");
        }

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId().equals(p.getProdId())) {
                products.set(i, p); // Update the product
                return; // Exit the loop after updating
            }
        }

        // If no product with the given prodId is found
        throw new IllegalArgumentException("Product with ID " + p.getProdId() + " not found.");
    }
    public void deleteProduct(Product p){
                products.remove(p);
    }
}
