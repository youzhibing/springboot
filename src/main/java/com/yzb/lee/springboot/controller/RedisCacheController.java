package com.yzb.lee.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzb.lee.springboot.domain.Person;
import com.yzb.lee.springboot.service.IPersonService;

@RestController
@RequestMapping(path="/redis")
public class RedisCacheController
{
	private Logger logger = LoggerFactory.getLogger(RedisCacheController.class);

	@Autowired
	private IPersonService personService;
	
	@GetMapping(path="/redisCache")
	@Cacheable(value="person-key")
	public Person getPerson(String personName)
	{
		logger.info("key : " + personName);
		System.out.println("personService == null : " + (personService == null));
		Person person = personService.findByPersonName(personName);
	    System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功"); 
		return person;
	}
}
