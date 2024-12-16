package com.assinment;

public class Developer extends Employee {
	private String programming;
	 public Developer(String name,int employeeId,double salarey, String programming) {
		 super(name,employeeId,salarey);
		 this.programming=programming;
	 }
	public String getProgramming() {
		return programming;
	}
	public void setProgramming(String programming) {
		this.programming = programming;
	}
	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("Programming:"+programming);
	}

}
