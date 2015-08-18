package com.local.site.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.RepositoryDao;
import com.local.site.model.Role;
import com.local.site.service.RoleService;
@Service
public class RoleServiceImpl extends RepositoryServiceImpl<Role> implements RoleService{

	@Override
	public RepositoryDao<Role> getMainDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
