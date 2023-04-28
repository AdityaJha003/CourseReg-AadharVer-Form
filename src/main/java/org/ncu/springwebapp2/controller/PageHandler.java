package org.ncu.springwebapp2.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageHandler {
	// input form will show the input form
	@RequestMapping(value = "/input-form")
	public String showInputForm() {
		return "input-form";
	}
	
	@RequestMapping(value = "/process")
	public String processInputForm(HttpServletRequest request, Model model) {
		
		String name  = request.getParameter("studentName");
		String pass  = request.getParameter("studentPass");
		String n = name.toUpperCase();
		String p = name.toUpperCase();
		model.addAttribute("Name", n);
		model.addAttribute("Pass", p);
		
		return "process-form";
	}
}
