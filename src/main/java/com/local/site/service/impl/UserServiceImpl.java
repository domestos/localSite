package com.local.site.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.RepositoryDao;
import com.local.site.model.User;
import com.local.site.service.UserService;
@Service
public class UserServiceImpl extends RepositoryServiceImpl<User> implements UserService{

	@Override
	public RepositoryDao<User> getMainDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
