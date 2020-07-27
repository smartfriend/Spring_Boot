package com.ibirds.SmallWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

	@RequestMapping("/reg")
	public String register() {
		return "registration";
	}
	
	@RequestMapping("/details")
	public String details() {
		return "user_details";
	}
}
