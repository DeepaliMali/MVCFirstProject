package com.BikkadIT.SpringMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class welcomeController {
	
	@GetMapping("/welcomeMessage")
	public String welcome(Model model)
	{
		String welMsg="Welcome to BikkadIT";
		
		model.addAttribute("MSG", welMsg);
	
		return "wel";
		
	}

}
