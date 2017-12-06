package com.perfact.t06.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;
import com.perfact.t06.bean.User;

public class UserAction extends ActionSupport {
	private User user;

	
	@Override
	public void validate() {
		Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z1-9_-]+$");
		
		super.validate();
	}
	
	public String toLogin() {
		
		return "tologin";
	}
	public String Login() {
		
		return "loginSuccess";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
