package com.zzz.mapper;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.zzz.mybatis.User;

public class TestMapper {
	private SqlSessionFactory sqlSessionFactory = null;
	private SqlSession sqlSession = null;

	@Before
	public void init() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}

	@Test
	public void test01() {
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      User user = mapper.selectById(2);
      System.out.println(user);
	}
}
