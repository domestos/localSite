package com.local.site.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.local.site.model.Cartridge;
import com.local.site.model.Owner;
import com.local.site.service.CartridgeService;
import com.local.site.service.OwnerService;

@Controller
public class OwnerController {

	@Autowired
	private CartridgeService caertridgeService;

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "/createOwner", method = RequestMethod.POST)
	public String saveOwner(Model model, @RequestParam(value = "name") String name, @RequestParam(value = "email") String email, @RequestParam(value = "phone") String phone) throws SQLException {
		Owner owner = new Owner();
		owner.setName(name);
		owner.setEmail(email);
		owner.setPhone(phone);
		ownerService.save(owner);
		return "redirect:/admin";
	}

	@RequestMapping("/admin")
	public String showAllOwner(Model model) {
		List<Owner> owners = ownerService.findAll();
		
		model.addAttribute("owners", owners);
		return "admin";
	}

	/* ADMIN VIEWS, INSER, UPDATE, DELETE */

	@RequestMapping(value = "/view/{id}")
	public String viewOwner(Model model, @PathVariable int id) {
		model.addAttribute("owners", ownerService.findAll());
		model.addAttribute("owner", ownerService.findOne(id));
		model.addAttribute("cartridges", ownerService.findOne(id).getCartridges());
		return "viewOwner";
	}

	@RequestMapping(value = "/view/{id}", method=RequestMethod.POST)
	public String viewOwnerPost(Model model, @RequestParam(value = "ownerId") String ownerId) {
		return "redirect:/view/" + ownerId;
	}
	
	@RequestMapping(value = "/view")
	public String viewOwnerView() {
		return "viewOwner";
	}
}
