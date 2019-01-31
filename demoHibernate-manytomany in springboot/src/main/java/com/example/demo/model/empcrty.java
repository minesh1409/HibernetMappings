package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="employee_crty")
public class empcrty {
	/*@Id @GeneratedValue(generator ="newGenerator" )
	@GenericGenerator(name="newGenerator",strategy="foreign", parameters= {@Parameter(value="employee",name="property")})
	private int emp_id;*/
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int crty_id;
	
	private String empCrty;	

	public int getCrty_id() {
		return crty_id;
	}

	public void setCrty_id(int crty_id) {
		this.crty_id = crty_id;
	}

	public String getEmpCrty() {
		return empCrty;
	}

	public void setEmpCrty(String empCrty) {
		this.empCrty = empCrty;
	}

	@Override
	public String toString() {
		return "empaddress [add_id=" + crty_id + ", empCrty=" + empCrty + "]";
	}

	
	
}
