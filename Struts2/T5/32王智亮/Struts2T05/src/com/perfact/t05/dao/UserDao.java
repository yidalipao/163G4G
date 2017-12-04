package com.perfact.t05.dao;

import java.util.List;

import com.perfact.t05.bean.User;

public interface UserDao {
	public void addUser(User user);

	public List<User> allUser();

	public void delete(int id);


	public User getUpdate(int id);

	public void update(User user);
}
