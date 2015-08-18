package com.local.site.service.impl;

import java.util.List;

import com.local.site.dao.RepositoryDao;
import com.local.site.service.RepositoryService;



public abstract class RepositoryServiceImpl<T> implements RepositoryService<T> {

	public abstract RepositoryDao<T> getMainDao();
	
	@Override
	public void save(T entity) {
		getMainDao().save(entity);
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findOne(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByProperty(String property, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
