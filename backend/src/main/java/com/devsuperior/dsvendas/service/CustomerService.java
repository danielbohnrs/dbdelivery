package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.CustomerDTO;
import com.devsuperior.dsvendas.entities.Customer;
import com.devsuperior.dsvendas.repositories.CustomerRepository;

@Service
public class CustomerService implements GenericService<Customer, CustomerDTO, Long> {

	@Autowired
	private CustomerRepository repository;
		
	@Override
	public JpaRepository<Customer, Long> getRepository() {
		return repository;
	}	
}
