package com.customer.service.CustomerService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.service.CustomerService.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	public List<Customer> getAllCustomers() {
		List<Customer> customers =new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setCustomerId("101");
		customer.setCustomerName("Vikas");
		customers.add(customer);
		return customers;
	}

}
