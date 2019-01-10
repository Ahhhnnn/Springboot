package com.he.attenddemo;

import com.he.attenddemo.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttenddemoApplicationTests {
	@Autowired
	private RedisDao redisDao;
	@Test
	public void contextLoads() {
		redisDao.setValue("test","123456");
	}

	@Test
	public void setValue(){
		String host = "127.0.0.1";
		int port = 6379;
		Jedis jedis=new Jedis(host,port);
		jedis.set("age","18");
		String age = jedis.get("age");
		String name = jedis.get("name");
		System.out.println(age+name);
	}
}

