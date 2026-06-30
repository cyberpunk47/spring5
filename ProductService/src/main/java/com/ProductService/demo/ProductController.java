package com.ProductService.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products")
    public String getProducts() throws Exception{
        Thread.sleep(5000);
        return "Laptop price from Product Service is 1000";
    }
}
