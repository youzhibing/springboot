package com.yzb.lee.springboot;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestRedis
{

	/**
	 * RedisTemplate的以String为重点的扩展。 由于对Redis的大多数操作都是基于String的，所以这个类提供了一个专门的类，可以最大限度地减少其更通用的模板的配置，特别是在序列化方面
	 */
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void test() throws Exception
	{
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void testObj() throws Exception
	{
		List<String> nums = stringRedisTemplate.opsForList().range("nums", 0, 4);
		for (String num : nums)
		{
			System.out.println(num);
		}
		System.out.println(stringRedisTemplate.opsForHash().entries("person"));
	}
}
