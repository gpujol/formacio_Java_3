package com.indra.formacio.controllers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indra.formacio.dao.EmployeeRepository;
import com.indra.formacio.model.Employee;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

//	@Autowired
//	EmployeeRepository empRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getCreateForm(Model model) {
		model.addAttribute(new Employee());
		return "employee/createForm";
	}
	
//	@RequestMapping(method=RequestMethod.POST)
//	public String create(Employee emp, BindingResult result) {
//		if (result.hasErrors()) {
//			return "employee/createForm";
//		}
//		this.employees.put(emp.assignId(), emp);
//		return "redirect:/account/" + emp.getId();
//	}
//	
//	@RequestMapping(value="{id}", method=RequestMethod.GET)
//	public String getView(@PathVariable Long id, Model model) {
//		Account account = this.accounts.get(id);
//		if (account == null) {
//			throw new ResourceNotFoundException(id);
//		}
//		model.addAttribute(account);
//		return "account/view";
//	}

}
