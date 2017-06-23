package com.yzb.lee.springboot.dao.mybatis;

import java.util.List;

import com.yzb.lee.springboot.domain.Person;

public interface PersonMapper
{
	//@Select("SELECT id,name,age FROM person")
	// 属性名与列名一直，则下面的字段之间的映射可以不用写
    /*@Results({
        @Result(property = "name",  column = "name"),
        @Result(property = "age", column = "age")
    })*/
    List<Person> listAll();
}
