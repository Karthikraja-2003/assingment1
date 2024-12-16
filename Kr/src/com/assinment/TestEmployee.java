package com.assinment;
import com.assinment.*;
public class TestEmployee {
	public static void main(String[] args) {
		Manager manager=new Manager("kr",101,8500,10);
		System.out.println("Manager details");
		manager.displaydetails();
		System.out.println();
		Developer developer=new Developer("kr2",105,6556,"bala");
		System.out.println("Developer details");
		developer.displaydetails();
		System.out.println();
	}

}
