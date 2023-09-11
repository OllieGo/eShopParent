package com.olliego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/create")
    public String createOrder(Integer productId, Integer userId) {
        /*String productName = restTemplate.getForObject("http://localhost:9000/product/" + productId, String.class);
        String userName = restTemplate.getForObject("http://localhost:10010/user/" + userId, String.class);
        String result = restTemplate.getForObject("http://localhost:11000/stock/reduce/" + productId, String.class);
        String shopCartResult = restTemplate.getForObject("http://localhost:12000/shopCart/remove?productId="
                + productId + "&userId="+userId, String.class);*/
        //return "productName:"+productName + " " + "userName:"+userName + " " + result + " " + shopCartResult;
        String result = restTemplate.getForObject("http://stock/stock/reduce/" + productId, String.class);

        return result;
    }
}
