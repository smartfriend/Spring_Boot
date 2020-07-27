package com.ibirds.demo2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/* method 1 to get value of data
	 * @RequestMapping("/result")
	 * public String index(HttpServletRequest req) {
	 * String data = req.getParameter("data"); HttpSession session =
	 * req.getSession(); session.setAttribute("value", data); return "result"; }
	 */
	
	/* method 2 to get value of data*/
	/*
	 * @RequestMapping("/result") 
	 * public String index(@RequestParam("val2") String data, HttpSession session) { session.setAttribute("value", data); 
	 * return "result"; }
	 * as session is a heavyweight variable we can use Model if there is not much data
	 */
	
	/* method 3 : model is a lightweight variable to use here
	@RequestMapping("/result")
	public String index(@RequestParam("val2") String data, Model model) {
		model.addAttribute("value", data);
		return "result";
	}*/
	
	/* method 4 : use of map : if there is alot of data coming from form*/
	@RequestMapping("/result")
	public ModelAndView index(@RequestParam("val2") String data) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("value", data);
		return new ModelAndView("result", map);
	}
	
}
