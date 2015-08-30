package com.local.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.local.site.model.User;
import com.local.site.service.UserService;


@Controller
public class AdminController {
 
	
	@Autowired
	private UserService userService; 
	
	@ModelAttribute("registration")
	public User construct(){
		
		return new User();
	} 
	/*
	@RequestMapping(value="/registration" , method=RequestMethod.POST)
	public String showAdminPage(Model model,
			@RequestParam(value = "name") String name,
			@RequestParam(value="email") String email, 
			@RequestParam(value="phone") String phone,
			@RequestParam(value="password") String password){
		return "admin";
	}
	*/
	
	

	@RequestMapping(value="/registration" , method=RequestMethod.POST)
	public String showAdminPage(Model model, @ModelAttribute("registration") User user){
		userService.save(user);
		System.out.println(user.toString());
		return "redirect:/admin";
	}
	
	
}
