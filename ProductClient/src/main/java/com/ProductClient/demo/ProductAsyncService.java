package com.ProductClient.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductAsyncService {
    @Autowired
    private RestTemplate restTemplate ; 

    @Async
    public void fetchProducts(){
        String res =restTemplate.getForObject("http://localhost:8082/products", String.class);
        System.out.println("Product Recieved " + res);  
    }
}
