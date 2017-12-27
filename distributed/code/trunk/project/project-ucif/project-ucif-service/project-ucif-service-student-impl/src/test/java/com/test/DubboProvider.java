package com.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DubboProvider {
	
	private static final Log log = LogFactory.getLog(DubboProvider.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/ucif-service-student.xml");
			context.start();
		} catch (Exception e) {
			log.error("== DubboProvider context start error:",e);
		}
		synchronized (DubboProvider.class) {
			while (true) {
				try {
					DubboProvider.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:",e);
				}
			}
		}
	}
    
}
