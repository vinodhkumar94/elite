package com.vidvaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "EMP_TAB2")
public class Employee {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	@Column(name="NAME")
	private String ename;
	@Column(name="EMAIL_ID")
	private String email;
	@Column(name="SALARY")
	private Double esal;
	
	public Employee(Integer eid, String ename, String email, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.esal = esal;
	}
	public Employee() {
		super();
	}
	public Integer getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public String getEmail() {
		return email;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", esal=" + esal + "]";
	}
	

}
