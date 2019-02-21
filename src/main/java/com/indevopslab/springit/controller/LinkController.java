package com.indevopslab.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indevopslab.springit.repository.LinkRepository;

@Controller
@RequestMapping("/links")
public class LinkController {

	private LinkRepository linkRepository;
	
	public LinkController(LinkRepository linkRepository) {
		this.linkRepository=linkRepository;
	}
	
	@GetMapping("/foo")
	public String foo(Model model) {
		model.addAttribute("pageTitle", "This is FOO");
		return "foo";
	}
	
	
}
