package com.javalearning.ajay;

public class TestingObject {
	
	public String variable;
	
	
	public String getVariable() {
		return variable;
	}


	public void setVariable(String variable) {
		this.variable = variable;
	}


	public void draw() {
		System.out.println(getVariable() + " checking");
	}
}
