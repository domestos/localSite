package com.local.site.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.local.site.dao.RepositoryDao;

public class RepositoryDaoImpl<T> implements RepositoryDao<T> {

	@PersistenceContext(unitName="primary")
	private EntityManager em; 
		
	
	@Transactional
	public void save(T entity) {
		em.persist(entity);
	}

	
	@Transactional
	public void delete(T entity) {
		em.remove(entity);
	}

	
	@Transactional
	public void deleteAll() {
		em.createQuery("DELETE FROM " + getEntityClass().getSimpleName())
		.executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		 return em.createQuery("From " + getEntityClass().getSimpleName()).getResultList();
			
	}

	@Override
	public T findOne(Object id) {
		return em.find(getEntityClass(), id);
	}

	@Transactional
	public T update(T entity) {
		return em.merge(entity);
	}
/*
	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String property, Object value) {
		return em.createQuery(
				"FROM" + getEntityClass() + "WHERE property = '" + value + "'").getResultList();
	}
	*/
	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String property, Object value) {
		return em.createQuery(
				"FROM" + getEntityClass() + "WHERE property = '" + value + "'").getResultList();
	}
	

	@Override
	public int count() {
		return ((Number) em.createQuery(
				"SELECT COUNT(c) FROM " + getEntityClass().getSimpleName() + " c")
				.getSingleResult()).intValue();
	}

	
	@SuppressWarnings("unchecked")
	protected final Class<T> getEntityClass() {
		final Type type = getClass().getGenericSuperclass() instanceof ParameterizedType
				? getClass().getGenericSuperclass() : getClass().getSuperclass().getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			final ParameterizedType paramType = (ParameterizedType) type;
			return (Class<T>) paramType.getActualTypeArguments()[0];
		} else
			throw new IllegalArgumentException("Could not guess entity class by reflection");
	}
	
	
}
