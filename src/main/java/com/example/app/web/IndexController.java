package com.example.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String home(Model model, String message) {
		model.addAttribute("message", message == null ? "Hello there!" : message);
		return "index";
	}

	@GetMapping("/next")
	public String next(Model model) {
		model.addAttribute("message", "Hello! You are in new page !!");
		return "next";
	}

}