package com.indra.formacio;

import java.util.ArrayList;

import com.indra.formacio.model.Customer;
import com.indra.formacio.model.Employee;
import com.indra.formacio.model.Product;
import com.indra.formacio.model.Sale;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static ArrayList<Employee> empleadosEmpresa;
	public static ArrayList<Customer> clientesEmpresa;
	public static ArrayList<Product> productosEmpresa;
	public static ArrayList<Sale> ventasEmpresa;
	
    public static void main( String[] args )
    {
        
    	initialize(new Integer [][] {{1,2},{3,4},{5,6,7,8}});
    	
    	//Vuestro código!!!
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	Employee emp;
//        Customer cust;
//        Product prod;
//        Sale sal;
//        
//        long empCounter = 0, custCounter = 0, prodCounter = 0;
//        
//        Sale [] arraySale = new Sale[3];
//        
//        for (int i = 0; i<=arraySale.length; i ++){
//
//        	//Creamos el empleado con el constructor por defecto       	
//        	emp = new Employee();
//        	
//        	//Creamos el empleado con el nuevo constructor
////        	emp = new Employee(empCounter,"Nom empleat "+empCounter, "Cognom empleat"+empCounter,"01/01/1970");
////        	empCounter++;
//
////        	Opción básica
////        	emp.setId(empCounter);
////        	empCounter=empCounter+1;
//        	emp.setId(empCounter++);
//        	emp.setName("Empleat "+emp.getId());
//
////        	Creamos el cliente
//        	cust = new Customer();
//        	cust.setId(custCounter++);
//        	cust.setName("Cliente "+cust.getId());
////        	seteamos el empleado
//        	cust.setEmployee(emp);
//        	
////        	Creamos el producto
//        	prod = new Product();
//        	prod.setId(prodCounter++);
//        	prod.setName("Producto "+prod.getId());
//        	
////        	Asociamos producto y cliente
//        	sal = new Sale(prod,cust);
//        	
//        	arraySale[i] = sal;
//        }

//        for (int i = 0; i < arraySale.length; i++) {
//			sal = arraySale[i];
//			print("Nombre del producto: " + sal.getProduct().getName());
//			System.out.println("	Nombre del cliente: " + sal.getCustomer().getName() + " que lo gestiona el empleado " + sal.getCustomer().getEmployee().getName());
//        }
               
//        for (Sale sale : arraySale) {
//			System.out.println("Nombre del producto: " + sale.getProduct().getName());
//			System.out.println("	Nombre del cliente: " + sale.getCustomer().getName() + " que lo gestiona el empleado " + sale.getCustomer().getEmployee().getName());
//		}
        
    }
    
    
    static void print(String entrada){
    	System.out.println(entrada);
    }
    
    private static void initialize(Integer [][] empCliProd){
    	empleadosEmpresa = new ArrayList<Employee>();
    	clientesEmpresa = new ArrayList<Customer>();
    	productosEmpresa = new ArrayList<Product>();
    	ventasEmpresa = new ArrayList<Sale>();
    	
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