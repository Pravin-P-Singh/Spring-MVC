package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.UserDao;
import com.tka.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean loginUser(User user) {
		return userDao.loginUser(user);
	}
}
