package com.zzz.mapper;

import java.util.List;

import com.zzz.mybatis.User;

public interface UserMapper {

	// ��ѯ
	public User selectById(int id);

	// ģ����ѯ
	public List<User> selectLike(String str);

	// ���
	public void insert(User u);

	// �޸�
	public void update(User u);

	// ɾ��
	public void delete(int id);

}
