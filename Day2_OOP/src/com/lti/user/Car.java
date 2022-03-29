package com.lti.user;

public class Car {
	
	static {
		System.out.println("faster ");
	}

	private static void drives() {
		System.out.println("faster");
	}

	public static void main(String[] args) {
		drives();
		drives();
	}

}
