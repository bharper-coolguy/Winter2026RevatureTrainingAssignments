package com.day4.FileHandlingLab;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * Auto-generated serialVersionUID from STS
	 */
	private static final long serialVersionUID = -6558559739565266636L;
	
	int empId;
	String empName;
	String department;
	double salary;
	
	
	public Employee(int empId, String empName, String department, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
}
