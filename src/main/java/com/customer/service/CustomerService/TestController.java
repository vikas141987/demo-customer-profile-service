package com.customer.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.CustomerService.domain.Customer;
import com.customer.service.CustomerService.service.CustomerService;

@RestController
public class TestController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
}
