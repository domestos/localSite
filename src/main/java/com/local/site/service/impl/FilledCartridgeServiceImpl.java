package com.local.site.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.local.site.dao.RepositoryDao;
import com.local.site.model.FilledCartridge;
import com.local.site.service.FilledCartridgeService;
@Service
public class FilledCartridgeServiceImpl extends RepositoryServiceImpl<FilledCartridge> implements FilledCartridgeService {

	@Override
	public RepositoryDao<FilledCartridge> getMainDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
