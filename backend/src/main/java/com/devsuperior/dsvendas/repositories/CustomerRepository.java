package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
