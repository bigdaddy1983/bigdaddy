package com.bigdaddy.bigdaddyCloud.controller;

import java.io.Serializable;

public class Person {

	/**
	 * 年龄
	 */
	private Integer age;
	private String name;

	public Integer getAge() {
		age++;
		
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
