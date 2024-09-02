package com.example.products_boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {


    @PostMapping("/hello")
    public ResponseEntity<?> hello(@RequestBody String username){
        return ResponseEntity.ok("hello: " + username);
    }
}
