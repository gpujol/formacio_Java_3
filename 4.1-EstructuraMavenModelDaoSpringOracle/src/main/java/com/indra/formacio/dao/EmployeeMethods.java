package com.indra.formacio.dao;

import java.util.Date;
import java.util.List;

import com.indra.formacio.model.Employee;

public interface EmployeeMethods {
	
	List<Employee> findByNameOrSurnameOrBirthdayBetween(
			String name, String surname, Date ini, Date end);

}
