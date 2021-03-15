package com.example.elastic.repository;

import java.util.List;

import com.example.elastic.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

   // List<Customer> findByFirstName(String firstname);

  //  List<Customer> findByLastName(String lastname);

    List<Customer> findByLenHo(String abc);
}