package com.yzhao66.springbootrocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootRocktmqApplication {

	@Resource
	private RocketMQTemplate rocketMQTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRocktmqApplication.class, args);
	}
	
}
