package com.zzz.mybatis.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.zzz.mybatis.User;

public class TestMybatis {
	//获取SqlSessionFactory
	private SqlSessionFactory sqlSessionFactory = null;
	
    @Before
	public void init() throws Exception {
    	FileInputStream inputStream = new FileInputStream("config/SqlMapConfig.xml");
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
	/**
	 * 测试根据Id查询一个对象
	 */
	@Test
	public void test01() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 User user = sqlSession.selectOne("SelectUserById", 1);
		 System.out.println(user);
	}
	
	/**
	 * 测试根据Id查询一个对象
	 */
	@Test
	public void test02() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 List<User> list = sqlSession.selectList("SelectUserByNameLike", "%王%");
		 System.out.println(list);
	}
}
