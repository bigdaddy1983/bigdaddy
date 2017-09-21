package com.bigdaddy.bigdaddyCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BigdaddyCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigdaddyCloudApplication.class, args);
	}
}
