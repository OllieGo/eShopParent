package com.olliego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/create")
    public String createOrder(Integer productId, Integer userId) {
        return "id:"+productId;
    }
}
