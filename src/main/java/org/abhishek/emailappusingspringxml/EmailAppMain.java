package org.abhishek.emailappusingspringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailAppMain {

	public static void main(String[] args) {
		
//		EmailClient client = new EmailClient(new BasicSpellChecker());
//		client.sendEmail("Test message");
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("emailapp/emailapp-beans.xml");
		EmailClient emailClient = 
				context.getBean("emailClient", EmailClient.class);
		emailClient.sendEmail("Test message");

	}

}
