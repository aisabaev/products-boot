package com.example.products_boot.controller;

import com.example.products_boot.request.CustomerSave;
import com.example.products_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerSave customer){
        customerService.saveCustomer(customer);
        return ResponseEntity.ok("Customer Saved!");
    }
}
