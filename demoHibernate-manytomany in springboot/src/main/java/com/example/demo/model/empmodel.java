package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class empmodel {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<empcrty> ec = new HashSet<empcrty>(0);

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

	public Set<empcrty> getEc() {
		return ec;
	}

	public void setEc(Set<empcrty> ec) {
		this.ec = ec;
	}

	@Override
	public String toString() {
		return "empmodel [emp_id=" + emp_id + ", name=" + name + "]";
	}

	

	
	
}
