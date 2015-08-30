package com.local.site.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.RepositoryDao;
import com.local.site.dao.UserDao;
import com.local.site.model.User;
import com.local.site.service.UserService;
@Service
public class UserServiceImpl extends RepositoryServiceImpl<User> implements UserService{
   @Autowired
   private UserDao dao;
	
	@Override
	public RepositoryDao<User> getMainDao() {
		
		return dao;
	}

}
