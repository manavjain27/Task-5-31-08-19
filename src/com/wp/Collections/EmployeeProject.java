package com.wp.Collections;

import java.util.HashMap;

public class EmployeeProject {

	public static void main(String[] args) {
		
		HashMap <Employees,Project> map=new HashMap<>();
		
		Employees e1=new Employees(1,"Manav",50000,"DBA");
		Employees e2=new Employees(2,"Sunny",70000,"Developer");
		Employees e3=new Employees(3,"Shivam",80000,"Developer");
		Employees e4=new Employees(4,"Akash",90000,"Tester");
		Employees e5=new Employees(4,"Akash",90000,"Tester");
		
		Project p1=new Project(101,"Payroll","1month","Vikas");
		Project p2=new Project(107,"StockMaintenance","3month","Vikas");
		Project p3=new Project(102,"Inventory","4month","Vikas");
		Project p4=new Project(103,"VisionDetection","1month","Vikas");
		Project p5=new Project(104,"ML","2month","Vikas");
		
		map.put(e1,p1);
		map.put(e2,p2);
		map.put(e3,p3);
		map.put(e4,p1);
		map.put(e5,p2);
		
		System.out.println(map);
		
		

	}

}
