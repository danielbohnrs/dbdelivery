package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Customer;

public class CustomerDTO {

	private Long id;
	private String name;
	
	public CustomerDTO() {
	}

	public CustomerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CustomerDTO(Customer entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
