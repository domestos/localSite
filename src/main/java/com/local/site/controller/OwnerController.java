package com.local.site.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.local.site.model.Owner;
import com.local.site.service.OwnerService;


@Controller
public class OwnerController {


@Autowired
private OwnerService service;
	
	@RequestMapping(value = "/createOwner", method = RequestMethod.POST)
	public String insertCompany(Model model, @RequestParam(value = "name") String name,
			@RequestParam(value = "email") String email, @RequestParam(value = "phone") String phone)
					throws SQLException {
		Owner owner = new Owner();
		owner.setName(name);
		owner.setEmail(email);
		owner.setPhone(phone);
		service.save(owner);
		return "redirect:/admin";
	}
	
@RequestMapping("/admin")
public String  showAllOwner(Model model){
	List<Owner> owners = service.findAll();
	model.addAttribute("owners" , owners);	
	return "admin";
}

/* ADMIN VIEWS, INSER, UPDATE, DELETE */

@RequestMapping(value = "/view/{id}")
public String viewOwner(Model model, @PathVariable int id ){
	
	model.addAttribute("owner", service.findOne(id));
	return "viewOwner";
}






}
