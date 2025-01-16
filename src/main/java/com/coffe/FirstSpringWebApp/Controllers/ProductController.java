package com.coffe.FirstSpringWebApp.Controllers;

import com.coffe.FirstSpringWebApp.Model.Product;
import com.coffe.FirstSpringWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//responsible to accept the req from the product
//REST tells spring that the class is a controller that means every methods returns a data: json , html
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product p){
        productService.addProduct(p);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product p){
        productService.updateProduct(p);
    }
    @DeleteMapping("/products")
    public void deleteProduct(Product p){
        productService.deleteProduct(p);
    }
}
