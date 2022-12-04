package com.javalearning.ajay;

public class TestingObject {
	
	public String variable;
	public int numvariable;
	
	public int getNumvariable() {
		return numvariable;
	}

	public TestingObject(int numvariable) {
		this.numvariable = numvariable;
	}
	
	public TestingObject(String variable) {
		this.variable = variable;
	}
	
	public TestingObject(int numvariable, String variable) {
		this.numvariable = numvariable;
		this.variable = variable;
	}
	
	public String getVariable() {
		return variable;
	}


	public void setVariable(String variable) {
		this.variable = variable;
	}


	public void draw() {
		System.out.println(getVariable() + " checking " + getNumvariable());
	}
}
