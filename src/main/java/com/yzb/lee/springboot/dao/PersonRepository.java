package com.yzb.lee.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yzb.lee.springboot.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>
{
	Person findByName(String name);
}
