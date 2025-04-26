package com.javatar.taxpayerservice.service;


import com.javatar.taxpayerservice.domain.Customer;
import com.javatar.taxpayerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> customers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long customerId) {
        return customerRepository.findById(customerId).get();
    }

    public void deleteCustomerById(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    public Customer updateCustomer(Long customerId, Customer customer) {
        Customer customerData = customerRepository.findById(customerId).get();
        if (customer.getPersonType() != null)
            customerData.setPersonType(customer.getPersonType());
        if (customer.getPersonUse() != null)
            customerData.setPersonUse(customer.getPersonUse());
        if (customer.getName() != null)
            customerData.setName(customer.getName());
        if (customer.getProvince() != null)
            customerData.setProvince(customer.getProvince());
        if (customer.getCity() != null)
            customerData.setCity(customer.getCity());
        if (customer.getAddress() != null)
            customerData.setAddress(customer.getAddress());
        if (customer.getPostalCode() != null)
            customerData.setPostalCode(customer.getPostalCode());
        if (customer.getPhone() != null)
            customerData.setPhone(customer.getPhone());
        if (customer.getFax() != null)
            customerData.setFax(customer.getFax());
        if (customer.getDescription() != null)
            customerData.setDescription(customer.getDescription());
        if (customer.getNationalCode() != null)
            customerData.setNationalCode(customer.getNationalCode());
        if (customer.getNewEconomicCode() != null)
            customerData.setNewEconomicCode(customer.getNewEconomicCode());
        if (customer.getUniqueMemoryIdentifier() != null)
            customerData.setUniqueMemoryIdentifier(customer.getUniqueMemoryIdentifier());

        return customerRepository.save(customerData);
    }

}
