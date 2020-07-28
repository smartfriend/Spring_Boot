package com.ibirds.SmallWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@RequestMapping("/reg")
	public String register() {
		return "registration";
	}
	
//	@RequestMapping("/details")
//	public String details(HttpServletRequest request) {
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("userPassword");
//		String gender   = request.getParameter("gender");
//		
//		HttpSession session = request.getSession();
//		session.setAttribute("user_name", userName);
//		session.setAttribute("user_password", password);
//		session.setAttribute("user_gender", gender);
//		
//		return "user_details";
//	}
	
	@RequestMapping("/details")
	public ModelAndView userInfo(UserRegistrationModel regModel) {
		ModelMap model = new ModelMap();
		
		model.addAttribute("userName", regModel.getUserName());
		model.addAttribute("userEmail", regModel.getUserEmail());
		model.addAttribute("gender", regModel.getGender() == Integer.parseInt("1")?"Female" : "Male");
		model.addAttribute("hobbies", regModel.getHobby());
		
		ModelAndView mv = new ModelAndView("user_details");
		mv.addObject("modelObj", model);
		return mv;
	}
	
	@RequestMapping("/operations")
	public String operations() {
		return "operations";
	}
}
