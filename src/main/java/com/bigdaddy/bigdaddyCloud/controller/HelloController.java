package com.bigdaddy.bigdaddyCloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigdaddy.bigdaddyService.SayHelloService;

@RestController
public class HelloController implements SayHelloService {

	// @RequestMapping("/hello")
	// public String index() {
	// // Person person = new Person();
	// // person.setAge(1);
	// // person.setName("张f");
	// // return person;
	// //int a = 1 / 0;
	// return "hello";
	// }
	//
	// @RequestMapping("/hello2")
	// public Person index1() {
	// Person person = new Person();
	// person.setAge(1);
	// person.setName("张f");
	// return person;
	//
	// }

	@Override
	public String sayHello() {
	
		
		return "lao zi yao dang bin";
	}

}
