package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class empController {
	
	@Autowired
	empDao dao;
	
	empmodel em=new empmodel();
	empmodel em1=new empmodel();
	empmodel em2=new empmodel();
	
	empaddress ea= new empaddress();
	empaddress ea2= new empaddress();
	
	
	
	@GetMapping("/")
	String save() {
		em.setName("employee");
		ea.setEmpAddress("address1");
		em.setEmpadrs(ea);
		
		em1.setName("emp1");
		em1.setEmpadrs(ea);
		
		em2.setName("emp2");
		ea2.setEmpAddress("address2");
		em2.setEmpadrs(ea2);
		
		(ea.getEmp()).add(em);
		(ea.getEmp()).add(em1);
		(ea2.getEmp()).add(em2);
		
		dao.save(ea);
		dao.save(ea2);			
		
		return "saved";
	}

}
