package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class empmodel {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private empaddress empadrs;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public empaddress getEmpadrs() {
		return empadrs;
	}

	public void setEmpadrs(empaddress empadrs) {
		this.empadrs = empadrs;
	}

	@Override
	public String toString() {
		return "empmodel [emp_id=" + emp_id + ", name=" + name + ", empadrs=" + empadrs + "]";
	}

	

	
	
}
