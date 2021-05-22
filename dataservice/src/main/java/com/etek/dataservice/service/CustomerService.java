package com.etek.dataservice.service;

import com.etek.dataservice.entity.Customer;
import com.etek.dataservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
}
