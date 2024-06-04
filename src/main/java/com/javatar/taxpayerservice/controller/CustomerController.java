package com.javatar.taxpayerservice.controller;

import com.javatar.taxpayerservice.domain.Customer;
import com.javatar.taxpayerservice.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("customer")
@Tag(name = "Customer", description = "Customer APIs")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> customers() {
        return customerService.customers();
    }

    @GetMapping("/{customerId}")
    public Customer findCustomerById(@PathVariable(value = "customerId") Long customerId) {
        return customerService.findCustomerById(customerId);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomerById(@PathVariable(value = "customerId") Long customerId) {
        customerService.deleteCustomerById(customerId);
    }

    @PutMapping("/{customerId}")
    public Customer updateCustomer(
            @PathVariable(value = "customerId") Long customerId,
            @RequestBody Customer customer) {
        return customerService.updateCustomer(customerId, customer);
    }
}
