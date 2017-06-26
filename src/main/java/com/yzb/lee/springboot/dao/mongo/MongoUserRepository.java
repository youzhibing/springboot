package com.yzb.lee.springboot.dao.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yzb.lee.springboot.domain.MongoUser;

public interface MongoUserRepository extends MongoRepository<MongoUser, String>
{
	MongoUser findByName(String name);
}
