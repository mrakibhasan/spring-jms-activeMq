package com.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener implements MessageListener {
	@Autowired
	JmsTemplate jmsTemplate;
	

	public void onMessage(Message message) {
		String json = null;

		if (message instanceof TextMessage) {
			try {
				json = ((TextMessage) message).getText();
				System.out.println("Message Received: "+ json);
				
			} catch (JMSException e) {
				jmsTemplate.convertAndSend(json);
			} /*catch (Exception e) {
				jmsTemplate.convertAndSend(json);
			}*/
		}
	}

}
