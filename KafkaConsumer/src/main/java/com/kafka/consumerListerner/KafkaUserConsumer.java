package com.kafka.consumerListerner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.model.User;

@Service
public class KafkaUserConsumer {

	
	@KafkaListener(topics = "livan_string", groupId = "group_id")
	public void usercomsumer(String name) {

		System.out.println("Comsumed string data from kafka : "+name);
	}
	
	@KafkaListener(topics = "livan_json", groupId = "group_json",
			containerFactory = "userfactory")
	public void usercomsumer(User user) {

		System.out.println("Comsumed json data from kafka : "+user);
	}
		
}
