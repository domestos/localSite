package com.local.site.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
			@RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email)
					throws SQLException {
		Owner owner = new Owner(name, phone, email);
		service.save(owner);
		return "redirect:/admin";
	}
}
