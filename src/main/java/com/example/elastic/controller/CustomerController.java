package com.example.elastic.controller;

import com.example.elastic.model.Customer;
import com.example.elastic.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers){
        customerRepository.saveAll(customers);
        return customers.size();
    }
    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
    @GetMapping("/findByID/{id}")
    public Optional<Customer> findByID(@PathVariable String id){
        return customerRepository.findById(id);
    }
    @GetMapping("/findByFName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        return customerRepository.findByFirstName(firstName);
    }
    @GetMapping("/findByLName/{lastName}")
    public List<Customer> findByLastName(@PathVariable String lastName) {
        return customerRepository.findByLastName(lastName);
    }
    @GetMapping("/findByAbc/{abc}")
    public List<Customer> findByLen(@PathVariable String abc) {
        return customerRepository.findByLenHo(abc);
    }
}
