package com.example.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

//	@GetMapping("/")
//	public String home(Map<String, Object> model, String message) {
//		model.put("message", message == null ? "Hello there!" : message);
//		return "index";
//	}

	@RequestMapping("/")
	public ModelAndView home(@ModelAttribute("message") String message) {
		return new ModelAndView("index", "message", message == null ? "Hello there!" : message);
	}

	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "Hello! You are in new page !!");
		return "next";
	}

}