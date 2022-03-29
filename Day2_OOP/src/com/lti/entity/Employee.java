package com.lti.entity;

public class Employee {

	private int empNo;
	private String empName;
	private double empSal;
	 String companyName="LTI Infotech";
	
  	void calcGrossSal()
	{
		
	}
	
	/*
	 * private boolean perm;
	 * 
	 * public boolean isPerm() { return perm; } public void setPerm(boolean perm) {
	 * this.perm = perm; }
	 */
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int eno) {
		this.empNo = eno;
	}
	
	
	//method same name as that of class 
	// don't have any return type 
	//constructos are used for initializing the objects 
	
	// constructor overloadding 
	//parameterized constructor 
	public Employee(int empNo, String empName, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.companyName="LTI";
	}
		
	//constr with 2 para 
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	//default constructor 
	//no para 
	  public Employee() { 
		  super(); 
		  }
	  


	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		
		if(empSal>=10000)
		{
		this.empSal = empSal;
		}
		
			
			
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", companyName="
				+ companyName + "]";
	}

	// toString is string representation of object data 


	
	
}
