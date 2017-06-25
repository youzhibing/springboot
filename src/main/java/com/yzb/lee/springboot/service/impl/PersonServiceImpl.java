package com.yzb.lee.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzb.lee.springboot.dao.jpa.PersonRepository;
import com.yzb.lee.springboot.domain.Person;
import com.yzb.lee.springboot.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService
{

	@Autowired
	private PersonRepository personRepository;
	
	/*@Autowired
	private PersonMapper personMapper;*/
	
	@Override
	public List<Person> listPerson()
	{
		return personRepository.findAll();
		//return personRepository.listAll();
	}

	@Override
	public Person findByPersonName(String name)
	{
		return personRepository.findByName(name);
	}

	
}
