package org.ncu.springwebapp2.controller;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.validation.Valid;

import org.ncu.springwebapp2.entity.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student")
public class FormController {
	
	@ModelAttribute("student")
	public student getStudent() {
		return new student();
	}

	@RequestMapping("/coursereg")
	public String showRegForm() {
		return "course-register";
	}

	@RequestMapping("/coursedis")
	public String displayForm(@Valid @ModelAttribute("student") student s,BindingResult bindingResult, Model model) {
//		String n = s.getName();
//		String p = s.getPass();
//		String cp = s.getConfirmPass();
//		String m = s.getMail();
//		String specialStr = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
//		for (int i = 0; i < n.length(); i++) {
//			char ch = n.charAt(i);
//			if (specialStr.contains(Character.toString(ch))) {
//				String st = "(No Special Character!!)";
//				model.addAttribute("errname", st);
//			}
//		}
//		for (int i = 0; i < p.length(); i++) {
//			char ch = p.charAt(i);
//			if (specialStr.contains(Character.toString(ch))) {
//				break;
//			}
//			if (i == p.length() - 1) {
//				String st = "(Special Characters not added)";
//				model.addAttribute("passSpe", st);
//			}
//		}
//		if (p.length() < 8) {
//			String stt = "(Required length not fulfilled)";
//			model.addAttribute("passLen", stt);
//		}
//		if (!(p.equals(cp))) {
//			String wr = "(Password doesn't match)";
//			model.addAttribute("wrpass", wr);
//		}
//		if (!(m.contains("@"))) {
//			String em = "(Email doesn't match required format)";
//			model.addAttribute("wrmail", em);
//		}
		if(bindingResult.hasErrors()) {
			return "course-register";
		}
		else {
		
		String name = s.getName();
	    String pass=s.getPass();
	    String mail=s.getMail();
	    String phoneNo = s.getPhNo();
	    String aadharId = s.getAadharId();
	    Date date= s.getDate();
	    String gen=s.getGender();
//	    String state = s.getState();
//	    List<String> otherVerOpt = s.getOtherOptions();
	    String address = s.getAddress();
	    String course=s.getCourse();
	    
	    try {
	    String URL = "jdbc:mysql://localhost:3306/mfw";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(URL,"root","Adiironman@2003");
	    Statement stmt = con.createStatement();
	    String a="insert into form values('"+name+"','"+pass+"','"+mail+"','"+phoneNo+"','"+aadharId+"','"+date+"','"+gen+"','"+address+"','"+course+"');";
	    System.out.println(a);
	    stmt.executeUpdate(a);
	    String s2="select * from mfw";
	    ResultSet rs=stmt.executeQuery(s2);
	    while(rs.next()) {
	    System.out.println(rs.getString("Name")+" "+rs.getString("Password")+" "+rs.getString("Email")+" "+rs.getString("PhoneNumber")+" "+rs.getString("adhaarId")+" "+rs.getString("DOB")+" "+rs.getString("Gender")+" "+rs.getString("Address")+" "+rs.getString("course"));
	    }
	    }
	    catch (Exception e) {
	    System.out.println(e);
	    }
	    model.addAttribute("name",name);
	    model.addAttribute("pass",pass);
	    model.addAttribute("mail",mail);
	    model.addAttribute("phoneNo",phoneNo);
	    model.addAttribute("aadharID",aadharId);
	    model.addAttribute("date",date);
	    model.addAttribute("gen",gen);
//	    model.addAttribute("state",state);
//	    model.addAttribute("otherVerOpt",otherVerOpt);
	    model.addAttribute("address", address);
	    model.addAttribute("course",course);
	    return "display-form";
	}
	}

		
//		if(bindingResult.hasErrors()) {
//			return "course-register";
//		}
//		else {
//			return "display-course";
//		}

	}


