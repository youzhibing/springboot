package com.yzb.lee.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yzb.lee.springboot.dao.jpa.PersonRepository;
import com.yzb.lee.springboot.domain.Person;
import com.yzb.lee.springboot.service.IPersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTests
{
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private IPersonService personService;

	@Test
	public void test() throws Exception
	{
		Person person = personRepository.findByName("李小龙");
		System.out.println(person);
	}
	
	@Test
	public void testService() throws Exception
	{
		Person person = personService.findByPersonName("李小龙");
		System.out.println(person);
	}
}
