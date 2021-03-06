package com.test.microservicecloudproviderdept8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //吧本身服务注册进eureka中
public class MicroservicecloudProviderDept8003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8003Application.class, args);
	}
}
