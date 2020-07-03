package com.siva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.siva.model.User;
import com.siva.service.IUserService;
import com.siva.validator.UserValidator;


@Controller
public class UserController {
	@Autowired
	private IUserService service;
	
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/user")
	public String show(Model model) {
		model.addAttribute("user", new User());
		return "UserRegister";	
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute User user,Errors errors,Model model) {
		validator.validate(user, errors);
		if(!errors.hasErrors()) {
		Integer id=service.saveUser(user);
		model.addAttribute("info", "User"+id+"saved!");
		model.addAttribute("user", new User());
		}else {
			model.addAttribute("info", "Please check all errors");
		}
		return "UserRegister";
		
	}
	

}
