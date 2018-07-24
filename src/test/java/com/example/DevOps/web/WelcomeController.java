package com.example.DevOps.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String welccme(Model model) {
		model.addAttribute("course", "DevOps");
		return "index";
	}
}
