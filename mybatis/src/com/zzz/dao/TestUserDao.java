package com.zzz.dao;

import org.junit.Test;

import com.zzz.mybatis.User;

public class TestUserDao {

	@Test
	public void test01() {
       UserDao userDao = new UserDaoImpl();
       User user = userDao.selectById(1);
       System.out.println(user);
	}
}
