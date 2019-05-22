package com.test.microservicecloudproviderdept8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka提供者，吧自身注册进eureka
public class MicroservicecloudProviderDept8002Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8002Application.class, args);
	}
}
