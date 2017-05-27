package com.jms.producer.sender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	JmsTemplate jmsTemplate;
	
	public void send(String json) {
		try{
			jmsTemplate.convertAndSend(json);
			
		}
		catch(JmsException jmsException)
		{
			System.out.println("Error of processing value");
		}
		
	}
}
