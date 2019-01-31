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
	
		
	public void save(empaddress ea) {
		System.out.println(ea.getDetail_id());
		System.out.println(ea.getEmpAddress());
		System.out.println(ea.getEmp());
	
		entityManager.persist(ea);
	}
	
}
