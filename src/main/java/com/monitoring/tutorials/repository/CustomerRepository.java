package com.monitoring.tutorials.repository;

import com.monitoring.tutorials.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

