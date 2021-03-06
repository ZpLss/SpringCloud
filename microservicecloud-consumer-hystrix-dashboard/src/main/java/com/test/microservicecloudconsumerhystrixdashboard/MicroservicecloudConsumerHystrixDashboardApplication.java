package com.test.microservicecloudconsumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard   //添加服务监控支持
public class MicroservicecloudConsumerHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerHystrixDashboardApplication.class, args);
	}
}
