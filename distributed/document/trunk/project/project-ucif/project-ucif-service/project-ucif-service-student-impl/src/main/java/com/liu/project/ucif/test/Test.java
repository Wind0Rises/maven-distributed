package com.liu.project.ucif.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.project.ucif.service.StudentService;


public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/spring-content.xml");
		StudentService studentService = (StudentService) context.getBean("studentService");
		studentService.test();
	}
}
