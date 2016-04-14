package com.indra.formacio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(SalePK.class)
public class Sale {
	@Id
	protected Customer customer;
	
	@Id
	protected Product product;
	

	
	@Column
	protected Date saleDate;
	
	public Sale(){
		
	}
	
	public Sale(Product product, Customer customer) {
//		this.product = product;
//		this.customer = customer;
		this.saleDate = new Date();
	}
	
//	public Product getProduct() {
//		return product;
//	}
//	public Customer getCustomer() {
//		return customer;
//	}
	public Date getSaleDate() {
		return saleDate;
	}

//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
}
