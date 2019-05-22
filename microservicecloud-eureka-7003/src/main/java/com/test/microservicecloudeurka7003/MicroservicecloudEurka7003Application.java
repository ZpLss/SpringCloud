package com.test.microservicecloudeurka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //eureka server服务端，接受其他微服务注册进来
public class MicroservicecloudEurka7003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudEurka7003Application.class, args);
	}
}
