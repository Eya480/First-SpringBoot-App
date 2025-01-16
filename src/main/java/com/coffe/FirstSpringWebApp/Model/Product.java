package com.coffe.FirstSpringWebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Product {
    private int prodId;
    private String prodName;
    private int price;
}
