package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
         
	
	  @PostMapping("/register")
	  public String createCustomerHandler(@RequestBody Customer crDto) {
		  
	  }
	
	  
}
