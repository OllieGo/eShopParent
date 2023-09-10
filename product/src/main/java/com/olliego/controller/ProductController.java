package com.olliego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ProductController {

    @GetMapping("/product/{productId}")
    public String getProduct(@PathVariable Integer productId) {
        return "Mi K40";
    }
}
