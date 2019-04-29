package com.kafka.consumerListerner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.model.User;

@Service
public class KafkaUserConsumer {

	
	@KafkaListener(topics = "livan_test", groupId = "group_json",
			containerFactory = "factory")
	public void usercomsumer(User user) {

		System.out.println("Comsumed data from kafka : "+user);
	}
}
