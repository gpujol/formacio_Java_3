package com.indra.formacio.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.indra.formacio.model.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee, Long>, EmployeeMethods {
	List<Employee> findByName(String name);
	
}
