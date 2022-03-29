package com.lti.inherit;

public abstract class Person {
	
	public int personId;
	public String personName;
	
	// method - no impl , no body // abstract 
	//class which has at least one method abstract - abstract class
	// can't instantiate abstract class // no object of abstract class 
	public abstract void calcSal();
	
		
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	

}
