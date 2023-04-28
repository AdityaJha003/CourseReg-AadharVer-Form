package org.ncu.springwebapp2.controller;

import java.util.regex.*;

import java.util.regex.Pattern;

import org.ncu.springwebapp2.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	// create a ModelAttribute method to load the domain object/entity
	@ModelAttribute("user")
	public User getUserEntity() {
		return new User();
	}
	
	
	//generate or show the input form
	@RequestMapping(value="/register")
	public String showRegistrationForm() {
		return "register-form";
	}
//	public static boolean
//    isValidPassword(String password)
//    {
// 
//        // Regex to check valid password.
//        String regex = "^(?=.*[0-9])"
//                       + "(?=.*[a-z])(?=.*[A-Z])"
//                       + "(?=.*[@#$%^&+=])"
//                       + "(?=\\S+$).{8,20}$";
// 
//        // Compile the ReGex
//        Pattern p = Pattern.compile(regex);
// 
//        // If the password is empty
//        // return false
//        if (password == null) {
//            return false;
//        }
// 
//        // Pattern class contains matcher() method
//        // to find matching between given password
//        // and regular expression.
//        Matcher m = p.matcher(password);
// 
//        // Return if the password
//        // matched the ReGex
//        return m.matches();
//    }
	
	
	// display the input form
	@RequestMapping(value="/display")
	public String displayInputForm(@ModelAttribute("user") User user, Model model) {
		String name = "Mr. "+user.getUserName();
		System.out.println("User details: "+user.toString());
		String pass = user.getUserPassword();
		System.out.println(isValidPassword(pass));
		
		
		model.addAttribute("updatedName", name);
		return "display-form";
	}


	private char[] isValidPassword(String pass) {
		// TODO Auto-generated method stub
		return null;
	}
}
