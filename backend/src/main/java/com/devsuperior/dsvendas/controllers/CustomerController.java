package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.CustomerDTO;
import com.devsuperior.dsvendas.service.CustomerService;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CustomerDTO> findById(@PathVariable Long id) {
		CustomerDTO obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	 
	@GetMapping
	public ResponseEntity<List<CustomerDTO>> findAll() {
		List<CustomerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
