package com.olliego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopCartController {

    @GetMapping("/shopCart/remove")
    public String remove(Integer productId, Integer userId) {
        return "移出成功";
    }
}
