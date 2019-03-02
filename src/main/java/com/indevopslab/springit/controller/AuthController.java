package com.indevopslab.springit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.indevopslab.springit.domain.User;

@Controller
public class AuthController {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@GetMapping("/login")
	public String login() {
		return "auth/login";
	}
	
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "auth/register";
	}
	
	

}
