package com.yzb.lee.springboot.domain;

import org.springframework.data.annotation.Id;

public class MongoUser
{
	@Id
	private String id;
	
	private String name;
	private int age;
	
	public MongoUser(){}
	
	public MongoUser(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "MongoUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
