package com.javalearning.ajay;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Using list in Spring xml for printing list in draw function
public class LearningBeanMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml")); deprecated
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		TestingObject obj = (TestingObject)context.getBean("mybean");
		obj.draw();
	}

}
