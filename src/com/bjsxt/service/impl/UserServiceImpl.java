package com.bjsxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.dao.UserDao;
import com.bjsxt.model.User;
import com.bjsxt.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	public void register(User u) {
		userDao.save(u);
		
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
}
