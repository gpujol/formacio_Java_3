package com.indra.formacio.webmodel;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class CustomerBean {
	
	@Size(min=2,max=50,message="El cliente tiene que tener nombre, y su longitud tiene que estar entre 2 y 50")
	private String name;
	
	@Size(min=2)
	private String surname;

	@NotEmpty
	private String employeeId;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
