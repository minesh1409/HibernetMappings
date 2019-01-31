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
@Table(name="employee_detail")
public class empdetail {
	/*@Id @GeneratedValue(generator ="newGenerator" )
	@GenericGenerator(name="newGenerator",strategy="foreign", parameters= {@Parameter(value="employee",name="property")})
	private int emp_id;*/
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int detail_id;
	
	private String empAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private empmodel emodel;

	public int getDetail_id() {
		return detail_id;
	}

	public void setDetail_id(int detail_id) {
		this.detail_id = detail_id;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public empmodel getEmodel() {
		return emodel;
	}

	public void setEmodel(empmodel emodel) {
		this.emodel = emodel;
	}
	
	
}
