package com.javalearning.ajay;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Creating multiple constructor to learn how the Spring XML calls each constructor
public class LearningBeanMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml")); deprecated
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TestingObject obj = (TestingObject)context.getBean("mybean");
		obj.draw();
	}

}
