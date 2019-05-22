package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //对hystrix熔断机制的支持
public class MicroservicecloudProviderDeptHystrix8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDeptHystrix8001Application.class, args);
	}
}
