package com.local.site.dao;

import java.util.List;

import com.local.site.model.Cartridge;
import com.local.site.model.Owner;

public interface CartridgeDao extends RepositoryDao<Cartridge> {

	List<Cartridge> findCartridges(Owner owner);

}
