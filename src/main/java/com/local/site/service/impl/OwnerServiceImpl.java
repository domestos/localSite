package com.local.site.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.OwnerDao;
import com.local.site.dao.RepositoryDao;
import com.local.site.model.Owner;
import com.local.site.service.OwnerService;

@Service
public class OwnerServiceImpl extends RepositoryServiceImpl<Owner> implements OwnerService{

	@Autowired
	private OwnerDao dao;
	
	@Override
	public RepositoryDao<Owner> getMainDao() {
		
		return dao;
	}

	
	
	
}
