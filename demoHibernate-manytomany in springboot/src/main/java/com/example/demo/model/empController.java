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
	
	empcrty ec1= new empcrty();
	empcrty ec2= new empcrty();
		
	@GetMapping("/")
	String save() {
		
		ec1.setEmpCrty("java");
		ec2.setEmpCrty("sql");
		
		em.setName("employee");
		em.getEc().add(ec1);
		
		em1.setName("emp1");
		em1.getEc().add(ec1);
		
		em2.setName("emp2");
		em2.getEc().add(ec2);
		
		dao.save(em);	
		dao.save(em1);	
		dao.save(em2);	
		return "saved";
	}

}
