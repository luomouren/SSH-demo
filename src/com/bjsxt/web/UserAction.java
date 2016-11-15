package com.bjsxt.web;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bjsxt.model.User;
import com.bjsxt.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
	
	public String uname;
	@Resource
	public UserService userService;
	public String reg(){
		User u = new User();
		u.setUname(uname);
		userService.register(u);
		return SUCCESS;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}
