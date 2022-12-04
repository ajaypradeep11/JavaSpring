package com.javalearning.ajay;

public class TestingObject {
	
	SmallObjects obj1 = new SmallObjects();
	SmallObjects obj2 = new SmallObjects();
	SmallObjects obj3 = new SmallObjects();
	


	public SmallObjects getObj1() {
		return obj1;
	}



	public void setObj1(SmallObjects obj1) {
		this.obj1 = obj1;
	}



	public SmallObjects getObj2() {
		return obj2;
	}



	public void setObj2(SmallObjects obj2) {
		this.obj2 = obj2;
	}



	public SmallObjects getObj3() {
		return obj3;
	}



	public void setObj3(SmallObjects obj3) {
		this.obj3 = obj3;
	}



	public void draw() {
		System.out.println(getObj1().value + " " + getObj2().value + " " +getObj3().value);
	}
}
