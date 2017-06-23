package com.yzb.lee.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person
{
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private int age;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
