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
@Table(name="employee_address")
public class empaddress {
	/*@Id @GeneratedValue(generator ="newGenerator" )
	@GenericGenerator(name="newGenerator",strategy="foreign", parameters= {@Parameter(value="employee",name="property")})
	private int emp_id;*/
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int add_id;
	
	private String empAddress;
	
	

	public int getDetail_id() {
		return add_id;
	}

	public void setDetail_id(int add_id) {
		this.add_id = add_id;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "empaddress [add_id=" + add_id + ", empAddress=" + empAddress + "]";
	}

	
	
}
