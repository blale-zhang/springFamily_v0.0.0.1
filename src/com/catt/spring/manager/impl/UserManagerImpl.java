package com.catt.spring.manager.impl;

import com.catt.spring.dao.BaseDao;
import com.catt.spring.dao.UserDao;
import com.catt.spring.manager.UserManager;
import com.catt.spring.mode.User;

/*@Service("userManager")
 @Transactional*/
public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	private BaseDao baseDao;

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void insertUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub

	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
