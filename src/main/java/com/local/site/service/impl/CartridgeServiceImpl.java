package com.local.site.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.RepositoryDao;
import com.local.site.model.Cartridge;
import com.local.site.service.CartridgeService;
@Service
public class CartridgeServiceImpl extends RepositoryServiceImpl<Cartridge> implements CartridgeService {

	@Override
	public RepositoryDao<Cartridge> getMainDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
