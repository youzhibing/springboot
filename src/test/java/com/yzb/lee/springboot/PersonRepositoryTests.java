package com.yzb.lee.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yzb.lee.springboot.dao.jpa.PersonRepository;
import com.yzb.lee.springboot.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonRepositoryTests
{
	@Autowired
	private PersonRepository personRepository;

	@Test
	public void test() throws Exception
	{
		Person person = personRepository.findByName("李小龙");
		System.out.println(person);
	}
}
