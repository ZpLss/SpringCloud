package com.test.microservicecloudconsumerdept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //eureka客户端，吧自身注册进微服务中
public class MicroservicecloudConsumerDept80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerDept80Application.class, args);
	}
}
