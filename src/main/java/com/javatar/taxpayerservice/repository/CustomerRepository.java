package com.javatar.taxpayerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javatar.taxpayerservice.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
