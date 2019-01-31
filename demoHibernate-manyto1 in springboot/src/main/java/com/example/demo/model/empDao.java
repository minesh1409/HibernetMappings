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
	
		
	public void save(empmodel em) {
		System.out.println(em.getEmp_id());
		System.out.println(em.getName());
		System.out.println(em.getEmpadrs());
	
		entityManager.persist(em);
	}
	
}
