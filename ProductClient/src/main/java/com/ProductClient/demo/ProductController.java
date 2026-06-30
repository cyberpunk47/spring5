package com.ProductClient.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductAsyncService productAsyncService;

    @GetMapping("/getproducts")
    public String getProducts() {
        productAsyncService.fetchProducts();
        return "Request Accepted : Product information is being fetched asynchronously.";
    }
}
