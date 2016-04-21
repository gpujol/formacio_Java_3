package com.indra.formacio.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.indra.formacio.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeMethods {

	@Autowired
	EntityManager em;
	
	public List<Employee> findByNameOrSurnameOrBirthdayBetween(
			String name, String surname, Date ini, Date end) {
		
		System.out.println("findByName!!!!");
		
		StringBuilder sQuery = new StringBuilder();
		sQuery.append(" FROM Employee e WHERE 1 = 1 ");
		
		if (name!=null && !name.equals("")) {
			sQuery.append(" AND e.name = :name ");
		}
		if (surname!=null  && !surname.equals("")){
			sQuery.append(" AND e.surname = :surname ");
		}
		if (ini != null){
			sQuery.append(" AND e.birthday >= :ini");
		}
		if (end != null){
			sQuery.append(" AND e.birthday <= :end ");
		}
		
		Query q = em.createQuery(sQuery.toString());
		
		if (name!=null  && !name.equals("")) {
			q.setParameter("name", name);
		}
		if (surname!=null  && !surname.equals("")){
			q.setParameter("surname", surname);
		}
		if (ini != null){
			q.setParameter("ini", ini);
		}
		if (end != null){
			q.setParameter("end", end);
		}
		
		return (List<Employee>)q.getResultList();
	}

}
