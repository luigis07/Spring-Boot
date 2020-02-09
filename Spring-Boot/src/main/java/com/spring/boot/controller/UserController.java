package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.boot.entity.User;
import com.spring.boot.repository.RolRepository;
import com.spring.boot.repository.UserRepository;
import com.spring.boot.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RolRepository rolRepository;
	
	@Autowired
	UserService userService;
 	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	 @GetMapping("/userForm")
	 public String userForm(Model model) {
		 
		 model.addAttribute("userForm", new User());
		 model.addAttribute("userList", userService.getAllUsers());
		 model.addAttribute("roles", rolRepository.findAll());
		 model.addAttribute("listTab", "active");
		 
		 return "user-form/user-view";
	 }
}
