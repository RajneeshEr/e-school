package com.online.school.config;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Bean
	public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory(
			ConnectionFactory connectionFactory) {
		SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory = new SimpleRabbitListenerContainerFactory();
		simpleRabbitListenerContainerFactory.setConnectionFactory(connectionFactory);
		return simpleRabbitListenerContainerFactory;
	}

	@Bean
	public RabbitTemplate rabbitTemplate(CachingConnectionFactory cachingConnectionFactory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(cachingConnectionFactory);
		cachingConnectionFactory.setConnectionTimeout(10000);
		cachingConnectionFactory.setRequestedHeartBeat(5000);
		rabbitTemplate.setChannelTransacted(true);
		return rabbitTemplate;
	}
	
}
