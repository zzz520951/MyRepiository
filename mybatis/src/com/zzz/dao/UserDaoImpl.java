package com.zzz.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.zzz.mybatis.User;

public class UserDaoImpl implements UserDao {
	private static SqlSessionFactory sqlSessionFactory = null;
	private static InputStream inputStream = null;
	static {
	
	try {
		inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Override
	public User selectById(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Object user = sqlSession.selectOne("SelectUserById",id);
		return (User) user;
	}

	@Override
	public List<User> selectAll() {
		
		return null;
	}

	@Override
	public void insert(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
