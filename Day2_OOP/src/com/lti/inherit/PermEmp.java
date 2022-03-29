package com.lti.inherit;

public class PermEmp extends Person{
	
	private double basicSal;

	public void calcSal()
	{
		int ta=50000;
		int hra=10000;		
	 double tSal=this.basicSal+ta+hra;	 
	 System.out.println("perm emp sal :" +tSal);
	}	
	
	
	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public PermEmp() {
		super();
		
	}

	public PermEmp(int personId, String personName, double basicSal) {
		super(personId, personName);
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "PermEmp [basicSal=" + basicSal + ", personId=" + personId + ", personName=" + personName + "]";
	}

	
}
