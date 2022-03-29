package com.lti.inherit;

public class ClientAapp {
	
	public static void main(String[] args) {
		
		// u can't instantiate/ create object of the abstract class 
		//Person p= new Person(111,"AAA");
		//System.out.println(p);	
		//p.calcSal();
		
		PermEmp pe= new PermEmp();	
			
		pe.setPersonId(101);
		pe.setPersonName("Jay");
		pe.setBasicSal(50000);
		System.out.println(pe);	
		pe.calcSal();
		
		
		TempEmp te= new TempEmp(102,"Vijay",5,2000);
		System.out.println(te);
		te.calcSal();
	
		System.out.println("\n ");
		Person p ;  // ref of parent super  class 		
		p=pe;	// super class ref -refering to child class at runtime 		
		p.calcSal(); // method dispatched based on child class it referes to 
		
		
		//why? 
		
		
		
		
		
		
	}

}
