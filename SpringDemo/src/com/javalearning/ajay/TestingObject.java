package com.javalearning.ajay;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class TestingObject 
{
	private SmallObjects obj1;
	private SmallObjects obj2;
	private SmallObjects obj3;
	


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



	/*
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub
	 * 
	 * System.out.println("Destroying bean using interface");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub
	 * System.out.println("Initializing bean using interface");
	 * 
	 * }
	 */
	
	/*
	 * public void init() { System.out.println("Initializing bean using method"); }
	 * 
	 * public void cleanup() { System.out.println("Destroying bean using method"); }
	 */
}
