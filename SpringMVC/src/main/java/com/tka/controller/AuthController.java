package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.entity.User;
import com.tka.service.UserService;

@Controller
public class AuthController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public String loginUser(@ModelAttribute User user, Model model) {
		boolean isLoggedIn=userService.loginUser(user);
		if(isLoggedIn) {
			return "home";
		} else {
			model.addAttribute("msg", "Invalid credentials");
		}
		return null;
	}
}
