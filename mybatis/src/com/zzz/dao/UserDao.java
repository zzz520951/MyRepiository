package com.zzz.dao;

import java.util.List;

import com.zzz.mybatis.User;

public interface UserDao {
	//��ѯ
     public User selectById(int id) ;
   //��ѯ
     public List<User> selectAll() ;
  //���
     public void insert(User u) ;
  //�޸�
     public void update(User u) ;
  //ɾ��
     public void delete(int id) ;
     
	
}
