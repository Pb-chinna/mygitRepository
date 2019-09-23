package com.springbootproj2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeModel {
	@Id
	
	private int eid;
	private String ename;
	private String address;
	private int salary;
	public int getEid() {
		return eid;
	}
	@Column(name="eid")
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	@Column(name="ename")
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	@Column(name="address")
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	@Column(name="salary")
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
