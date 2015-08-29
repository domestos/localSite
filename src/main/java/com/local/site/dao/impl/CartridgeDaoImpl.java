package com.local.site.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.local.site.dao.CartridgeDao;
import com.local.site.model.Cartridge;
import com.local.site.model.Owner;
@Repository
public class CartridgeDaoImpl extends RepositoryDaoImpl<Cartridge> implements CartridgeDao{
	
	@Transactional
	@Override
	public List<Cartridge> findCartridges(Owner owner) {
		 Session session = (Session) em.getDelegate();
		 Criteria hibernateCriteria = session.createCriteria(Cartridge.class);
		 return hibernateCriteria.add(Restrictions.eq("owner", owner)).list();
		
		
	}

	
}
