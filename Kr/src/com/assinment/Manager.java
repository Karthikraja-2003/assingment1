package com.assinment;

public class Manager extends Employee {
	private int teamsize;
	public Manager(String name,int employeeId,double salarey,int teamsize) {
		super(name,employeeId,salarey);
		
		this.teamsize=teamsize;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("team size:"+teamsize);
	}

}
