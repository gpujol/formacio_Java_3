package com.indra.formacio.model;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
	
	private List<Employee> empleadosEmpresa;
	private List<Customer> clientesEmpresa;
	private List<Product> productosEmpresa;
	private List<Sale> ventasEmpresa;
	
	public Enterprise(){
		this.empleadosEmpresa = new ArrayList<Employee>();
		this.clientesEmpresa = new ArrayList<Customer>();
		this.productosEmpresa = new ArrayList<Product>();
		this.ventasEmpresa = new ArrayList<Sale>();		
	}
	
	public Enterprise(List<Employee> empleadosEmpresa, List<Customer> clientesEmpresa,
			List<Product> productosEmpresa, List<Sale> ventasEmpresa) {
		this.empleadosEmpresa = empleadosEmpresa;
		this.clientesEmpresa = clientesEmpresa;
		this.productosEmpresa = productosEmpresa;
		this.ventasEmpresa = ventasEmpresa;
	}

	public List<Employee> getEmpleadosEmpresa() {
		return empleadosEmpresa;
	}

	public void setEmpleadosEmpresa(List<Employee> empleadosEmpresa) {
		this.empleadosEmpresa = empleadosEmpresa;
	}

	public List<Customer> getClientesEmpresa() {
		return clientesEmpresa;
	}

	public void setClientesEmpresa(List<Customer> clientesEmpresa) {
		this.clientesEmpresa = clientesEmpresa;
	}

	public List<Product> getProductosEmpresa() {
		return productosEmpresa;
	}

	public void setProductosEmpresa(List<Product> productosEmpresa) {
		this.productosEmpresa = productosEmpresa;
	}

	public List<Sale> getVentasEmpresa() {
		return ventasEmpresa;
	}

	public void setVentasEmpresa(List<Sale> ventasEmpresa) {
		this.ventasEmpresa = ventasEmpresa;
	}

    public void initialize(Integer [][] empCliProd){
    	
    	Employee e;
    	Customer c;
    	int numProduct;
    	Product p;
    	Sale s;
    	
    	for (int i = 0; i < empCliProd.length; i++) {
			e = new Employee();
			e.setId(new Long(i));
			e.setName("Empleado "+i);
			empleadosEmpresa.add(e);
			for (int j = 0; j < empCliProd[i].length; j++) {
				c = new Customer();
				c.setId(new Long(j));
				c.setName("Cliente " +j+ " del empleado "+i);
				c.setEmployee(e);
				clientesEmpresa.add(c);
				numProduct = empCliProd[i][j];
				for (int k = 0; k < numProduct; k++) {
					p = new Product();
					p.setId(new Long(k));
					p.setName("Producto " +k + " del "+c.getName());
					productosEmpresa.add(p);
					s = new Sale(p,c);
					ventasEmpresa.add(s);
				}
			}
		} 	
    	
    }
	
	
}
