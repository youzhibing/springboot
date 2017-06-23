package com.yzb.lee.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yzb.lee.springboot.domain.Person;
import com.yzb.lee.springboot.service.IPersonService;

@Controller
@RequestMapping(path="/page")
public class PageController
{
	private Logger logger = LoggerFactory.getLogger(PageController.class);

	@Autowired
	private IPersonService personService;
	
	/**
	 * 测试hello
	 * 
	 * @return
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model)
	{
		logger.info("test, hello");
		model.addAttribute("name", "Dear");
		return "hello";
	}
	
	//@RequestMapping(value = "/persons", method = RequestMethod.GET)
	@GetMapping(path="/persons")
	public String listPerson(Model model)
	{
		logger.info("list all person");
		List<Person> persons = personService.listPerson();
		System.out.println(persons.size());
		model.addAttribute("persons", persons);
		return "person/person";
	}
}
