package com.lti.inherit;

public class TempEmp extends Person{

	int days;
	int salPerDay;
	
	public void calcSal()
	{
		int tSal=days*salPerDay;
		System.out.println("TempEmp sal : " + tSal);
	}
	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getSalPerDay() {
		return salPerDay;
	}
	public void setSalPerDay(int salPerDay) {
		this.salPerDay = salPerDay;
	}
	
	public TempEmp(int personId, String personName, int days, int salPerDay) {
		super(personId, personName);
		this.days = days;
		this.salPerDay = salPerDay;
	}
	@Override
	public String toString() {
		return "TempEmp [days=" + days + ", salPerDay=" + salPerDay + ", personId=" + personId + ", personName="
				+ personName + "]";
	}
	
	
	
}
