package com.example.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class IndexController {

	@GetMapping("/")
	public String home(Map<String, Object> model, String message) {
		model.put("message", message == null ? "Hello there!" : message);
		return "index";
	}

	@GetMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "Hello! You are in new page !!");
		return "next";
	}

}