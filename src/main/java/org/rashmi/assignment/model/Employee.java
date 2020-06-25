package org.rashmi.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "employeeName")
	String employeeName;

	@Column(name = "department")
	String department;

	public Employee() {
		super();

	}
	

	public Employee(int id, String employeeName, String department) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.department = department;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}