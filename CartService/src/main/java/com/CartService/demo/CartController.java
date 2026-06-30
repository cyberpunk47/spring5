package com.CartService.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping("/items")
    public String getCartItems() {
        return "List of items in the cart";
    }
}
