package com.wty.helper;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class Provider {
	private RabbitTemplate rabbitTemplate;

	public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	public void send (Object message)
	{
		rabbitTemplate.convertAndSend("rtkey",message);
	}
}
