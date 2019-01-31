package com.example.demo;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.empDao;
import com.example.demo.model.empcrty;
import com.example.demo.model.empmodel;
import com.fasterxml.classmate.AnnotationConfiguration;

@SpringBootApplication
public class DemoHibernateApplication {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		/*empmodel em=new empmodel();
		empdetail ed= new empdetail();
		empDao edao = new empDao();
		
		em.setName("employee1");
		ed.setEmpAddress("emplyee address1");
		ed.setEmodel(em);
		edao.save(ed);*/	
		
		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(ed);
		s.getTransaction().commit();
		s.close();*/
		
		SpringApplication.run(DemoHibernateApplication.class, args);
	}

}

