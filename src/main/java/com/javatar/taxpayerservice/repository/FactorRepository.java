package com.javatar.taxpayerservice.repository;


import com.javatar.taxpayerservice.domain.Factor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactorRepository extends JpaRepository<Factor, Long> {
}
