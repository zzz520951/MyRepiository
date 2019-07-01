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
	//��ȡSqlSessionFactory
	private SqlSessionFactory sqlSessionFactory = null;
	
    @Before
	public void init() throws Exception {
    	FileInputStream inputStream = new FileInputStream("config/SqlMapConfig.xml");
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
	/**
	 * ���Ը���Id��ѯһ������
	 */
	@Test
	public void test01() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 User user = sqlSession.selectOne("SelectUserById", 1);
		 System.out.println(user);
	}
	
	/**
	 * ���Ը���Id��ѯһ������
	 */
	@Test
	public void test02() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 List<User> list = sqlSession.selectList("SelectUserByNameLike", "%��%");
		 System.out.println(list);
	}
}
