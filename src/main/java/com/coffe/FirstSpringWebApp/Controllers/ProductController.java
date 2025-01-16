package com.coffe.FirstSpringWebApp.Controllers;

import com.coffe.FirstSpringWebApp.Model.Product;
import com.coffe.FirstSpringWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//responsible to accept the req from the product
//REST tells spring that the class is a controller that means every methods returns a data: json , html
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/product")
    public List<Product> getProduct(){
        return productService.getProducts();
    }
}
