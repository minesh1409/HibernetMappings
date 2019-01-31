package com.example.demo.model;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class empDao {
	
	@Autowired
	EntityManager entityManager;
	
		
	public void save(empdetail ed) {
		System.out.println(ed.getEmpAddress());
		System.out.println(ed.getEmodel());
		entityManager.merge(ed);
	}

}
