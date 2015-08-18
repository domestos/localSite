package com.local.site.dao;

import java.sql.SQLException;
import java.util.List;

public interface RepositoryDao<T> {

	void save(T entity) ;
	
	void delete(T entity) ;
	
	void deleteAll() ;

	List<T> findAll() ;
	
	T findOne(Object id) ;

	T update(T entity) ;

	List<T> findByProperty(String property, Object value) ;

	int count() ;
	
	
	
}
