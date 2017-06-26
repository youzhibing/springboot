package com.yzb.lee.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yzb.lee.springboot.dao.mongo.MongoUserRepository;
import com.yzb.lee.springboot.domain.MongoUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTests
{
	@Autowired
	private MongoUserRepository userRepo;
	
	@Test
	public void test() throws Exception
	{
		//MongoUser user = userRepo.findOne("5950ed27d8d7709df0f01bdb");
		MongoUser user = userRepo.findByName("youzhibing");
		System.out.println(user);
	}
}
