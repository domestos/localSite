package com.local.site.service;

import java.util.List;

import com.local.site.model.Cartridge;
import com.local.site.model.Owner;

public interface CartridgeService extends RepositoryService<Cartridge> {

	List<Cartridge> findCartridges(Owner owner);

}
