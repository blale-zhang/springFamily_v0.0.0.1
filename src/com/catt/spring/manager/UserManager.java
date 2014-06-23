package com.catt.spring.manager;

import com.catt.spring.mode.User;

public interface UserManager {

	public void insertUser(User u);
	
	public void updateUser(User u);
	
	public void deleteUser(User u);
}
