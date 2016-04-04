package com.indra.formacio.model;

import java.util.Date;

/**
 * Objects of this class represent an Employee
 * 
 * @author ealcalal
 *
 */
public class Employee {
	protected Long id;
	protected String name;
	protected String surname;
	protected Date bithday;
	protected Float percentCustomers;
	protected Date percentDate;
	
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBithday() {
		return bithday;
	}
	public void setBithday(Date bithday) {
		this.bithday = bithday;
	}
	public Float getPercentCustomers() {
		return percentCustomers;
	}
	public void setPercentCustomers(Float percentCustomers) {
		this.percentCustomers = percentCustomers;
	}
	public Date getPercentDate() {
		return percentDate;
	}
	public void setPercentDate(Date percentDate) {
		this.percentDate = percentDate;
	}
	
}
