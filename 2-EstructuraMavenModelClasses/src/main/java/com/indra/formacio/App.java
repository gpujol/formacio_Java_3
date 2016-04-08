package com.indra.formacio;

import com.indra.formacio.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        
//    	Enterprise ent = new Enterprise();
//    	ent.initialize(new Integer [][] {{1,2},{3,4},{5,6,7,8}});
//    	//Vuestro código para pintar
    	
    	provaPunters();
    	
    	
    	

    	System.out.println("working...");
    }
    
    private static void provaPunters(){
    	//Ejemplo de java y punteros
    	
    	Employee [] arrayEmp = new Employee [2];
    	Employee emp = new Employee();
    	emp.setName("Nombre1");
    	arrayEmp[0] = emp;
    	Employee emp2 = new Employee();
    	emp2.setSurname("Apellido");
    	arrayEmp[1] =emp2;
    	
    	emp.setSurname("ApellidoX");
    	arrayEmp[1].setName("NombreX");
    	
    	System.out.println(arrayEmp[0].getSurname());
    	System.out.println(emp2.getName());
    }

}