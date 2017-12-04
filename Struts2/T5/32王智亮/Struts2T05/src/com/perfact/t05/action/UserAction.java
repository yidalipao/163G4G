package com.perfact.t05.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.perfact.t05.bean.User;
import com.perfact.t05.dao.UserDao;
import com.perfact.t05.dao.impl.UserDaoImpl;

public class UserAction extends ActionSupport{
	private User user;
	private List<User> users = new ArrayList<>();
	private UserDao uDao = new UserDaoImpl();
	
	public String addUser() throws Exception{
		if (user!=null) {
			uDao.addUser(user);
		}
		return "tolist";
	}
	public String allUser() throws Exception{
		users = uDao.allUser();
		return "list";
	}
	public String del() throws Exception {
		uDao.delete(user.getId());
		return "tolist";
	}
	public String perUpdate() throws Exception{
		user = uDao.getUpdate(user.getId());
		return "update";
	}
	public String update() throws Exception{
		if (user!=null) {
			uDao.update(user);
		}
		return "tolist";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public UserDao getuDao() {
		return uDao;
	}
	public void setuDao(UserDao uDao) {
		this.uDao = uDao;
	}
	
	
	
}

