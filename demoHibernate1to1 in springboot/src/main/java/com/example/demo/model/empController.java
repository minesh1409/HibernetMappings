package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class empController {
	
	@Autowired
	empDao dao;
	
	empmodel em=new empmodel();
	empdetail ed= new empdetail();
	
	
	@GetMapping("/")
	String save() {
		em.setName("employee1");
		ed.setEmpAddress("emplyee address1");
		ed.setEmodel(em);
		dao.save(ed);	
		return "saved";
	}
	
	@PostMapping("/")
	public ResponseEntity<String> register(@RequestBody empdetail ed, UriComponentsBuilder builder) {
		ed.setEmodel(em);
		dao.save(ed);	
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}

}
