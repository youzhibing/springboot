package com.yzb.lee.springboot.service;

import java.util.List;

import com.yzb.lee.springboot.domain.Person;

public interface IPersonService
{
	/**
	 * 获取全部person
	 * @return
	 */
	List<Person> listPerson();
	
	Person findByPersonName(String name);
}
