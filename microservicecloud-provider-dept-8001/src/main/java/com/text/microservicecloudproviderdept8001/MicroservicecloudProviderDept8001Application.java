package com.text.microservicecloudproviderdept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动后将8001注册进eureka中
public class MicroservicecloudProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
	}
}
