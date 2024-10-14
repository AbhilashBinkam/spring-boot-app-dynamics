package com.monitoring.tutorials.service;

import com.monitoring.tutorials.entity.Customer;
import com.monitoring.tutorials.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return args -> {
            // Prepopulate some customer data
            repository.save(new Customer("John Doe", "john@example.com"));
            repository.save(new Customer("Jane Smith", "jane@example.com"));
            repository.save(new Customer("Alice Johnson", "alice@example.com"));
            repository.save(new Customer("Bob Lee", "bob@example.com"));

            log.info("Pre populated customers in the database");
        };
    }
}
