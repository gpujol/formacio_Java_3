package com.indra.formacio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.indra.formacio.dao.CustomerRepository;
import com.indra.formacio.dao.EmployeeRepository;
import com.indra.formacio.model.Customer;
import com.indra.formacio.model.Employee;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CustomerRepoTest extends TestCase {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	@Autowired
	CustomerRepository cRepo;
	@Autowired
	EmployeeRepository eRepo;
	
	@Test
	public void testCrud() throws ParseException {
		Employee e = eRepo.findOne(1L);
		
		Customer custA = new Customer();
		custA.setName("Federico");
		custA.setSurname("Larcia Gorca");
		custA.setPercentDate(sdf.parse("04/04/2016"));
		custA.setPercentProduct(2.4d);		
		custA.setEmployee(e);
		
		cRepo.save(custA);
		assertNotNull(custA.getId());
		
		List<Customer> res = cRepo.findByName("Federico");
		assertFalse(res.isEmpty());
		
		Customer custB = res.get(0);
		
		assertEquals(custA.getId(), custB.getId());
		assertEquals(custA.getName(), custB.getName());
		assertEquals(custA.getSurname(), custB.getSurname());
		assertEquals(custA.getPercentDate(), custB.getPercentDate());
		assertEquals(custA.getPercentProduct(), custB.getPercentProduct());
		assertEquals(custA.getEmployee().getId(), custB.getEmployee().getId());
		System.out.println(custA.getEmployee().equals( custB.getEmployee()));
		assertEquals(custA.getEmployee(), custB.getEmployee());
		assertEquals(custA.hashCode(), custB.hashCode());
		assertEquals(custA,custB);
		
		res = cRepo.findBySurname("Larcia");
		assertFalse(res.isEmpty());
		
		custB = res.get(0);
		
		System.out.println("prova!!!!!! "+custB.getSurname());
	}
	
	@Test
	public void testFileInsertedData() {
		List<Customer> res = cRepo.findByName("Client 1.1");
		assertFalse(res.isEmpty());
	}
}
