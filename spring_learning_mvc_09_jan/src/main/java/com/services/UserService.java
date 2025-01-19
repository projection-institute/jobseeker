package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.User;
import com.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean registerUser(User user) {
		return userDao.registerUser(user);
	}
	
	public User loginUser(String email, String password) {
		return userDao.loginUser(email, password);
	}
}
