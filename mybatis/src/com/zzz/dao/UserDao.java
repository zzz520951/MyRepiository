package com.zzz.dao;

import java.util.List;

import com.zzz.mybatis.User;

public interface UserDao {
	//查询
     public User selectById(int id) ;
   //查询
     public List<User> selectAll() ;
  //添加
     public void insert(User u) ;
  //修改
     public void update(User u) ;
  //删除
     public void delete(int id) ;
     
	
}
