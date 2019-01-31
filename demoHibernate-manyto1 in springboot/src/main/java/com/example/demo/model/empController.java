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
	
	empaddress ed= new empaddress();
	empaddress ed2= new empaddress();
	
	
	
	@GetMapping("/")
	String save() {
		em.setName("employee");
		ed.setEmpAddress("address1");
		em.setEmpadrs(ed);
		
		em1.setName("emp1");
		em1.setEmpadrs(ed);
		
		em2.setName("emp2");
		ed2.setEmpAddress("address2");
		em2.setEmpadrs(ed2);
		
		dao.save(em);	
		dao.save(em1);	
		dao.save(em2);	
		return "saved";
	}

}
