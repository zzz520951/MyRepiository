package com.zzz.mapper;

import java.util.List;

import com.zzz.mybatis.User;

public interface UserMapper {

	// 查询
	public User selectById(int id);

	// 模糊查询
	public List<User> selectLike(String str);

	// 添加
	public void insert(User u);

	// 修改
	public void update(User u);

	// 删除
	public void delete(int id);

}
