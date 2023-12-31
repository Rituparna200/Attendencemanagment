package com.Spring.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="departmentdetail")
public class Department {
	@Id
	@Column(name = "departmentid")
	String departmentId;
	
	@Column(name = "departmentName")
	String departmentName;
	
	@Column(name = "noofEmployee")
	Date noOfEmployee;
	
	@Column(name = "managerid")
	String managerId;

	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Date getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(Date noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

}
