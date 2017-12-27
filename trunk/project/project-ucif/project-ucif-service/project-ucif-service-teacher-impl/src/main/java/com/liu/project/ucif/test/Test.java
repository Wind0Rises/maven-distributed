package com.liu.project.ucif.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.project.ucif.service.TeacherService;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/ucif-service-teacher.xml");
		TeacherService teacherService = (TeacherService) context.getBean("teacherService");
		teacherService.test();
	}
}
