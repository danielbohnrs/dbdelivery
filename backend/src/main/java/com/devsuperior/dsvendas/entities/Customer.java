package com.devsuperior.dsvendas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.devsuperior.dsvendas.dto.CustomerDTO;
import com.devsuperior.dsvendas.util.Convertible;


@Entity
@Table(name = "tb_customer")
public class Customer implements Convertible<CustomerDTO> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Customer() {
	}

	public Customer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
 
	@Override
	public CustomerDTO convert() {
		return new CustomerDTO(this);
	}
}
