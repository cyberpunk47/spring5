package com.productclient.prodclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductClientController {
    private RestTemplate restTemplate;

    @GetMapping("/getproduct")
    public String getProduct() {
        String response = restTemplate.getForObject("http://localhost:8030/product", String.class);
        return response;
    }
}
