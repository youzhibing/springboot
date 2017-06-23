package com.yzb.lee.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzb.lee.springboot.domain.User;

@RestController  // 默认类中的方法都会以json的格式返回
public class HelloWorldController
{
	@RequestMapping("/hello")
	public String index()
	{
		return "Hello World";
	}
	
	@RequestMapping("/getUser")
	public User getUser(int id)
	{
		return new User(id, "yzb", 27);
	}
}
