package org.ncu.springwebapp2.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String test() throws IOException{
		
		return ("home");
	}
	
	@RequestMapping(value = "/date-page")
	public String getDate(Model model) {
		Date date = new Date();
		System.out.println("Today's Date is: " +date);
		model.addAttribute("currentDate", date);
		return "home";
	}
}
