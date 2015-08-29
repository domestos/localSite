package com.local.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.local.site.model.Cartridge;
import com.local.site.model.Owner;
import com.local.site.service.CartridgeService;
import com.local.site.service.OwnerService;

@Controller
public class CartridgeController {

	@Autowired
	private CartridgeService cartridgeService;
	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "/view/createCartridge", method = RequestMethod.POST)
	public String saveCartridge(Model model,
			@RequestParam(value = "type") String type, 
			@RequestParam(value = "number") String number,
			@RequestParam(value = "ownerId") int ownerId) {
		Cartridge cartridge = new Cartridge();
		Owner owner = ownerService.findOne(ownerId);		
		cartridge.setType(type);
		cartridge.setNumber(number);
		cartridge.setOwner(owner);
		cartridgeService.save(cartridge);
		return "redirect:/view/" + ownerId;
	}

}
