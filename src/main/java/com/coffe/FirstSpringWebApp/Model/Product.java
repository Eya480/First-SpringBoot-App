package com.coffe.FirstSpringWebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Product {
    private Integer prodId;
    private String prodName;
    private Integer price;
}
