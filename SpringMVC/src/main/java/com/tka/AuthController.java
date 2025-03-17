package com.tka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.entity.User;

@Controller
public class AuthController {

	@PostMapping("/login")
	public String loginUser(@ModelAttribute User user, Model model) {
		System.out.println("Inside auth controller");
		System.out.println(user);
		if("admin".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			return "home";
		} else {
			model.addAttribute("msg", "Invalid credentials");
			return "login";
		}
	}
}
