package com.bigdaddy.bigdaddyCloud.controller;

import org.springframework.stereotype.Component;

import com.bigdaddy.bigdaddyService.SayHelloService;

@Component
public class HelloServiceFallback implements SayHelloService {

	@Override
	public String sayHello() {
		return "error";
	}

}
