package com.lti.user;

import com.lti.entity.Employee;

public class UserApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Jay", 5000.00);			
		System.out.println(e1);
		
		
				
		Employee e2 = new Employee();
		
		  e2.setEmpNo(102); 
		  e2.setEmpName("Vijay");
		  e2.setEmpSal(10000);	// setter method //validation 	 
		 System.out.println(e2);
		 

	}

}
