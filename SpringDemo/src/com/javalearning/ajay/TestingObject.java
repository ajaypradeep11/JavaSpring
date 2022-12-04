package com.javalearning.ajay;

import java.util.List;

public class TestingObject {
	
	private List<SmallObjects> objs;

	

	public List<SmallObjects> getObjs() {
		return objs;
	}



	public void setObjs(List<SmallObjects> objs) {
		this.objs = objs;
	}



	public void draw() {
		for(SmallObjects obj : objs) {
			System.out.println(obj.value + " got it");
		}
		
	}
}
