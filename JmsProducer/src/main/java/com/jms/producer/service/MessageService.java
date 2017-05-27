package com.jms.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.jms.producer.model.Vendor;
import com.jms.producer.sender.MessageSender;

@Component
public class MessageService {
	
	@Autowired
	MessageSender messageSender;
	
	public void process(Vendor vendor) {
		Gson gson = new Gson();
		String json = gson.toJson(vendor);
		System.out.println("Message: " + json);
		messageSender.send(json);
	}

}
