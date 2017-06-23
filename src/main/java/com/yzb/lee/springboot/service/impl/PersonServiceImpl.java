package com.yzb.lee.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzb.lee.springboot.dao.jpa.PersonRepository;
import com.yzb.lee.springboot.dao.mybatis.PersonMapper;
import com.yzb.lee.springboot.domain.Person;
import com.yzb.lee.springboot.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService
{

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public List<Person> listPerson()
	{
		//return personRepository.findAll();
		return personMapper.listAll();
	}

}
