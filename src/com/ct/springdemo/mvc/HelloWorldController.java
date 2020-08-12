package com.ct.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm( ) {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( ) {
		return "helloworld";
	}
	
	@RequestMapping("/shoutName")
	public String shoutName(HttpServletRequest request, Model model ) {
		
		String name = request.getParameter("studentName");
				
		String message = "Yo!! " + name.toUpperCase();
	
		model.addAttribute("message",message);
		
		return "helloworld";
	}
	
	@RequestMapping("/shoutName1")
	public String shoutName1(@RequestParam("studentName") String name, Model model ) {
						
		String message = "Yo!!!! " + name.toUpperCase();
	
		model.addAttribute("message",message);
		
		return "helloworld";
	}
	
	
}
