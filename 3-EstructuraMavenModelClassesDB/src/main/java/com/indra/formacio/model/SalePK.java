package com.indra.formacio.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;


public class SalePK implements Serializable {
	
	protected Customer customer;
	
	protected Product product;
	
	public SalePK(){
		
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((SalePK)obj).getCustomer().equals(this.customer) 
				&& ((SalePK)obj).getProduct().equals(this.product);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
