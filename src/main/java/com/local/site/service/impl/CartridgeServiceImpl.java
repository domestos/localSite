package com.local.site.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.CartridgeDao;
import com.local.site.dao.RepositoryDao;
import com.local.site.model.Cartridge;
import com.local.site.model.Owner;
import com.local.site.service.CartridgeService;
@Service
public class CartridgeServiceImpl extends RepositoryServiceImpl<Cartridge> implements CartridgeService {

	@Autowired 
	private CartridgeDao dao;
	
	@Override
	public RepositoryDao<Cartridge> getMainDao() {
		return dao;
	}

	@Override
	public List<Cartridge> findCartridges(Owner owner) {
		
		return dao.findCartridges(owner);
	}

}
