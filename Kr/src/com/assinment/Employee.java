package com.assinment;

public class Employee {
	private String name;
	private int employeeId;
	private double salarey;
	
	public Employee(String name, int employeeId, double salarey) {
		this.name=name;
		this.employeeId=employeeId;
		this.salarey=salarey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalarey() {
		return salarey;
	}

	public void setSalarey(double salarey) {
		this.salarey = salarey;
	}
	public void displaydetails() {
		System.out.println("Name:"+name);
		System.out.println("EmployeeID:"+employeeId);
		System.out.println("Salarey:"+salarey);
	}

}
